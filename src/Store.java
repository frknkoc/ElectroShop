import Product.Phone;
import Product.Products;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Store {
    Scanner input = new Scanner(System.in);

    List<Products> productMark = new ArrayList<>();
    List<Phone> phoneList = new ArrayList<>();

    public void addMark(){
        productMark.add(new Products(1, "Samsung"));
        productMark.add(new Products(2, "Lenovo"));
        productMark.add(new Products(3, "Apple"));
        productMark.add(new Products(4, "Huawei"));
        productMark.add(new Products(5, "Casper"));
        productMark.add(new Products(6, "Asus"));
        productMark.add(new Products(7, "HP"));
        productMark.add(new Products(8, "Xiaomi"));
        productMark.add(new Products(9, "Monster"));
        System.out.println("Markalar Eklendi!!!");
    }

    public void addPhone(){
        phoneList.add(new Phone(1, "SAMSUNG GALAXY A51", 3199, "Samsung", 12, 60, 8, 128, 6));
        phoneList.add(new Phone(2, "iPhone 11 64 GB\t", 12000, "Apple", 0, 999, 8, 64, 6));
        phoneList.add(new Phone(3, "Redmi Note 10 Pro 8GB", 4012, "Redmi", 0, 200, 8, 128, 6));
        phoneList.add(new Phone(4, "iPhone 13 Pro 256 GB", 32099, "Apple", 0, 1000, 12, 256, 7));
        phoneList.add(new Phone(5, "SAMSUNG GALAXY Note 50 Pro", 12000, "Samsung", 0, 549, 8, 64, 6));
        phoneList.add(new Phone(6, "Redmi Note 11 Pro 6GB", 5499, "Redmi", 0, 200, 6, 64, 6));
    }

    public void addNewMark(){
        System.out.println("\nYeni marka eklemek istiyorsanız 1e tılayın\n");
        String selectCase = input.next();
        if (selectCase.equals("1")){
            System.out.println("Lütfen eklemek istediğiniz markayı yazınız...");
            String newMark = input.next();
            int a = productMark.size();
            productMark.add(new Products(a + 1 , newMark));
            showMark();
        } else {
            System.out.println("Yeni marka eklemek istemediğinizi belirttiniz.");
        }
    }

    public void showMark(){
        productMark.sort(new CompareToName());
        System.out.println("\n-- Markalarımız --\n");
        for (int i = 0; i < productMark.size(); i++){
            productMark.get(i).setId(i + 1);
            System.out.println(productMark.get(i).getId() +  "- " + productMark.get(i).getMarkName());
        }
    }

    public void showPhone(){
        System.out.println("\n-- Telefonlarımız --\n");
        String format = "%-5s | %-20s | %-10s | %-15s | %-10s | %-10s | %-5s | %-10s | %-10s%n";
        String header = String.format(format, "ID", "Telefon Adı", "Fiyat", "Marka", "İndirim", "Stok", "RAM", "Depolama", "Ekran Boyutu");
        System.out.println(header);
        for (Phone phone : phoneList
            ) {
            System.out.println(String.format(format, phone.getId(), phone.getPhoneName(), phone.getPrice(), phone.getMarkName(), phone.getDiscount(), phone.getStock(), phone.getRam(), phone.getStorage(), phone.getScreenSize()));
        }
    }

    public void phoneAddRemove(){
        boolean menuShow = true;
        while(menuShow){
        System.out.println("\nYeni model telefon eklemek için 1'e tıklayınız...");
        System.out.println("Telefon silmek istiyorsanız 2'e tıklayınız...");
        System.out.println("Telefonları markalarına göre filtrelemek için 3'e tıklayınız...");
            System.out.println("Menüden çıkış yapmak için 0'a tıklayınız...");
        int selectPhoneCase = input.nextInt();
        switch (selectPhoneCase){
            case 1:
                int a = phoneList.size();
                System.out.println("\nLütfen eklemek istediğiniz telefonun modelini yazınız...");
                String newPhoneName = input.next();
                System.out.println("\nLütfen telefonun fiyatını yazınız...");
                int newPhonePrice = input.nextInt();
                System.out.println("\nLütfen telefonun markasını yazınız...");
                String newPhoneMark = input.next();
                System.out.println("\nLütfen telefonun indirim varsa yazınız...");
                int newPhoneDiscount = input.nextInt();
                System.out.println("\nLütfen telefonun stok miktarını yazınız...");
                int newPhoneStock = input.nextInt();
                System.out.println("\nLütfen telefonun ram bilgisini yazınız...");
                int newPhoneRam = input.nextInt();
                System.out.println("\nLütfen telefonun hafıza bilgisini yazınız...");
                int newPhoneStorage = input.nextInt();
                System.out.println("\nLütfen telefonun hafıza bilgisini yazınız...");
                int newPhoneScreenSize = input.nextInt();
                phoneList.add(new Phone(a + 1 , newPhoneName, newPhonePrice, newPhoneMark, newPhoneDiscount, newPhoneStock, newPhoneRam, newPhoneStorage, newPhoneScreenSize));
                showPhone();
                break;
            case 2:
                System.out.println("\nLütfen silmek istediğiniz telefonun numarasını yazınız...");
                int selectPhone = Integer.parseInt(input.next());
                phoneList.remove(selectPhone - 1);
                showPhone();
                break;
            case 3:
                System.out.println("\nLütfen aramak istediğiniz telefon markasını yazınız...");
                String selectPhoneMark = input.next();
                System.out.println("\n Aradığınız Marka : " + selectPhoneMark);
                String format = "%-5s | %-20s | %-10s | %-15s | %-10s | %-10s | %-5s | %-10s | %-10s%n";
                String header = String.format(format, "ID", "Telefon Adı", "Fiyat", "Marka", "İndirim", "Stok", "RAM", "Depolama", "Ekran Boyutu");
                System.out.println(header);
                int counter = 1;
                for (int i = 0; i < phoneList.size(); i++){
                    if (phoneList.get(i).getMarkName().equals(selectPhoneMark)){
                        System.out.println(String.format(format, (counter), phoneList.get(i).getPhoneName(), phoneList.get(i).getPrice(), phoneList.get(i).getMarkName(), phoneList.get(i).getDiscount(), phoneList.get(i).getStock(), phoneList.get(i).getRam(), phoneList.get(i).getStorage(), phoneList.get(i).getScreenSize()));
                        counter++;
                    }
                }
                break;
            case 0:
                menuShow = false;
                break;
            default:
                System.out.println("Lütfen girdiğiniz rakamı kontrol edip tekrar deneyiniz...");
        }
    }
}
}

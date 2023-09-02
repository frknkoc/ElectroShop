import Product.NoteBook;
import Product.Phone;
import Product.Products;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store {
    Scanner input = new Scanner(System.in);

    List<Products> productMark = new ArrayList<>();
    List<Phone> phoneList = new ArrayList<>();
    List<NoteBook> noteBookList = new ArrayList<>();

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

    public void addNotebook(){
        noteBookList.add(new NoteBook(1, "HUAWEI Matebook 14", 7000, "Huawei", 0, 400, 16, 512, 14));
        noteBookList.add(new NoteBook(2, "LENOVO V14 IGL", 3699, "Lenovo", 0, 188, 8, 256, 15));
        noteBookList.add(new NoteBook(3, "Apple Macbook Air 13", 15000, "Apple", 0, 100, 8, 256, 13));
        noteBookList.add(new NoteBook(4, "Monster Tulpar", 12099, "Monster", 0, 250, 32, 1024, 17));
        noteBookList.add(new NoteBook(5, "LENOVO Yoga", 4000, "Lenovo", 0, 200, 8, 256, 15));
        noteBookList.add(new NoteBook(6, "HUAWEI Matebook D15", 5999, "Huawei", 0, 450, 8, 512, 15));
        noteBookList.add(new NoteBook(7, "Monster Abra V6", 8999, "Monster", 0, 400, 12, 512, 15));
        noteBookList.add(new NoteBook(8, "Apple Macbook Pro 13", 12099, "Apple", 0, 100, 16, 512, 13));
    }

    public void showMark(){
        productMark.sort(new CompareToName());
        System.out.println("\n-- Markalarımız --\n");
        for (int i = 0; i < productMark.size(); i++){
            productMark.get(i).setId(i + 1);
            System.out.println(productMark.get(i).getId() +  "- " + productMark.get(i).getMarkName());
        }
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

    public void showPhone(){
        System.out.println("\n-- Telefonlarımız --\n");
        String format = "%-5s | %-20s | %-10s | %-15s | %-10s | %-10s | %-5s | %-10s | %-10s%n";
        String header = String.format(format, "ID", "Telefon Adı", "Fiyat", "Marka", "İndirim", "Stok", "RAM", "Depolama", "Ekran Boyutu");
        System.out.println(header);
        int counter = 1;
        for (Phone phone : phoneList
            ) {
            System.out.println(String.format(format, counter++, phone.getPhoneName(), phone.getPrice(), phone.getMarkName(), phone.getDiscount(), phone.getStock(), phone.getRam(), phone.getStorage(), phone.getScreenSize()));
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
                    System.out.println("\nLütfen telefonun ekran boyutu bilgisini yazınız...");
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

    public void showNotebook(){
        System.out.println("\n-- Notebook'lar --\n");
        String format = "%-5s | %-20s | %-10s | %-15s | %-10s | %-10s | %-5s | %-10s | %-10s%n";
        String header = String.format(format, "ID", "Notebook Adı", "Fiyat", "Marka", "İndirim", "Stok", "RAM", "Depolama", "Ekran Boyutu");
        System.out.println(header);
        int counter = 1;
        for (NoteBook noteBook : noteBookList
        ) {
            System.out.println(String.format(format, counter++, noteBook.getNotebookName(), noteBook.getPrice(), noteBook.getMarkName(), noteBook.getDiscount(), noteBook.getStock(), noteBook.getRam(), noteBook.getStorage(), noteBook.getScreenSize()));
        }
    }

    public void notebookAddRemove(){
        boolean menuShow = true;
        while(menuShow){
            System.out.println("\nYeni model notebook eklemek için 1'e tıklayınız...");
            System.out.println("Notebook silmek istiyorsanız 2'e tıklayınız...");
            System.out.println("Notebookları markalarına göre filtrelemek için 3'e tıklayınız...");
            System.out.println("Menüden çıkış yapmak için 0'a tıklayınız...");
            int selectNotebookCase = input.nextInt();
            switch (selectNotebookCase){
                case 1:
                    int a = noteBookList.size();
                    System.out.println("\nLütfen eklemek istediğiniz notebook modelini yazınız...");
                    String newNotebookName = input.next();
                    System.out.println("\nLütfen notebook fiyatını yazınız...");
                    int newNotebookPrice = input.nextInt();
                    System.out.println("\nLütfen notebook markasını yazınız...");
                    String newNotebookMark = input.next();
                    System.out.println("\nLütfen notebookta indirim varsa yazınız...");
                    int newNotebookDiscount = input.nextInt();
                    System.out.println("\nLütfen notebookun stok miktarını yazınız...");
                    int newNotebookStock = input.nextInt();
                    System.out.println("\nLütfen notebookun ram bilgisini yazınız...");
                    int newNotebookRam = input.nextInt();
                    System.out.println("\nLütfen notebookun hafıza bilgisini yazınız...");
                    int newNotebookStorage = input.nextInt();
                    System.out.println("\nLütfen notebookun ekran boyutu bilgisini yazınız...");
                    int newNotebookScreenSize = input.nextInt();
                    noteBookList.add(new NoteBook(a + 1 , newNotebookName, newNotebookPrice, newNotebookMark, newNotebookDiscount, newNotebookStock, newNotebookRam, newNotebookStorage, newNotebookScreenSize));
                    showNotebook();
                    break;
                case 2:
                    System.out.println("\nLütfen silmek istediğiniz notebookun numarasını yazınız...");
                    int selectNotebook = Integer.parseInt(input.next());
                    noteBookList.remove(selectNotebook - 1);
                    showNotebook();
                    break;
                case 3:
                    System.out.println("\nLütfen aramak istediğiniz notebook markasını yazınız...");
                    String selectNotebookMark = input.next();
                    System.out.println("\n Aradığınız Marka : " + selectNotebookMark);
                    String format = "%-5s | %-20s | %-10s | %-15s | %-10s | %-10s | %-5s | %-10s | %-10s%n";
                    String header = String.format(format, "ID", "Notebook Adı", "Fiyat", "Marka", "İndirim", "Stok", "RAM", "Depolama", "Ekran Boyutu");
                    System.out.println(header);
                    int counter = 1;
                    for (int i = 0; i < noteBookList.size(); i++){
                        if (noteBookList.get(i).getMarkName().equals(selectNotebookMark)){
                            System.out.println(String.format(format, (counter), noteBookList.get(i).getNotebookName(), noteBookList.get(i).getPrice(), noteBookList.get(i).getMarkName(), noteBookList.get(i).getDiscount(), noteBookList.get(i).getStock(), noteBookList.get(i).getRam(), noteBookList.get(i).getStorage(), noteBookList.get(i).getScreenSize()));
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

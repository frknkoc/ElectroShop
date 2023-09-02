import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Store electroShop = new Store();
        Scanner input = new Scanner(System.in);
        System.out.println("Electro Shop Yönetim Paneli !");
        boolean menuShow = true;
        while(menuShow){
            System.out.println(
                    "\nLütfen yapmak istediğiniz işlemi seçiniz!\n\n" +
                    "1 - Notebook İşlemleri\n" +
                    "2 - Cep Telefonu İşlemleri\n" +
                    "3 - Marka Listesi\n" +
                    "0 - Çıkış Yap\n"
            );
            int selectCase = input.nextInt();
            while (selectCase < 0 && selectCase > 3){
                System.out.println("Hatalı rakam girdiniz! Lütfen yapmak istediğinz işlemi tekrar seçiniz...");
                selectCase = input.nextInt();
            }
            switch (selectCase){
                case 1:
                    electroShop.addNotebook();
                    electroShop.showNotebook();
                    electroShop.notebookAddRemove();
                    break;
                case 2:
                    electroShop.addPhone();
                    electroShop.showPhone();
                    electroShop.phoneAddRemove();
                    break;
                case 3:
                    electroShop.addMark();
                    electroShop.showMark();
                    electroShop.addNewMark();
                    break;
                case 0:
                    System.out.println("Güle güle :)");
                    menuShow = false;
                    break;
            }
        }
    }
}
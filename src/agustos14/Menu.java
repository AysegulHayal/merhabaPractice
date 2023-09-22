package agustos14;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);
    ArrayList<User> kullanicilar = new ArrayList<>();
Registration registration=new Registration();
    void menu(){
        //       -kayit alma -sansli kullanici -kullanicilari listeleme -cikis
        boolean cikis = true;
        do{
            System.out.println("1.Kayit Islemi\n"+
                               "2. Kisi Listele\n"+
                               "3.Sansli Kisiler\n"+
                               "4. Cikis\n"+
                               "Seciminiz: ");
            int secim =scan.nextInt();
            switch (secim){
                case 1:
                    kullanicilar= Registration.register();
                    break;
                case 2:
                    registration.kullaniciListesi(kullanicilar);
                    break;
                case 3:
                    Registration.printHappyUser(kullanicilar);
                    break;
                case 4:
                    cikis=false;
                    break;
                default:
                    System.out.println("Hatali giris yaptiniz..");
                    break;
            }
        }while (cikis);

    }
}

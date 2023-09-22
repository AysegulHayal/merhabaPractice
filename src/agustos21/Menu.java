package agustos21;

import java.util.Scanner;

public class Menu extends Methodlar{
    Scanner scan=new Scanner (System.in);
    void giris(){
        System.out.println("Yeni kullanici olusturmak icin '1'\n" +
                           "Sisteme giris icin 2'ye basiniz...");
        int secim=scan.nextInt();
        switch (secim){
            case 1:
                kullaniciOlustur();
                giris();
            case 2:

            default:
        }

    }
}

package agustos21;

import java.util.ArrayList;
import java.util.Scanner;

public class Methodlar {
    /*
    ATM
Kullanicidan giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,


Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis islemleri olacaktır.


Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,

Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina geri donsun.

Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
     */
    ArrayList<Kullanici> kullaniciList = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    void kullaniciGirisi(){
        System.out.println("Kart no giriniz:");
        String kartNo=scan.nextLine();
        System.out.println("Sifre giriniz: ");
        int sifre= scan.nextInt();
        for (Kullanici each:kullaniciList) {
            if (each.getKartNo().equals(kartNo)&& each.getSifre()==sifre){

            }
        }

        }

    void kullaniciOlustur(){
        System.out.println("Kart no giriniz: ");
        String kartNo=scan.nextLine().replace(" ","");
        System.out.println("Sifre giriniz: ");
        int sifre=scan.nextInt();
        System.out.println("Bakiye giriniz: ");
        double bakiye=scan.nextDouble();
        scan.nextLine();
        Kullanici kullanici = new Kullanici(kartNo,sifre,bakiye);
        kullaniciList.add(kullanici);
}

    void bakiyeSorgula() {
        String kartNo = scan.nextLine();
        boolean flag = true;
        for (Kullanici each : kullaniciList) {
            if (each.getKartNo().equals(kartNo)) {
                System.out.println(kartNo + " ait bakiye= " + "each.getBakiye");
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Hatali giris yaptiniz..");
           bakiyeSorgula();
        }
    }
     void paraYatirma() {
        String kartNo=scan.nextLine();
        boolean flag = true;
        for (Kullanici each : kullaniciList) {
            if (each.getKartNo().equals(kartNo)){
                System.out.println("Yatirmak istediginiz miktari giriniz");
            double miktar = scan.nextDouble();
            each.setBakiye(miktar + each.getBakiye());
            System.out.println("Bakiyeniz="+each.getBakiye());
            flag=false;
        }
    }
    if (flag){
               System.out.println("Hatali giris yaptiniz..");
               paraYatirma();
    }


        for (Kullanici each:kullaniciList){
            if (each.getKartNo().equals(kartNo)){
                System.out.println("Cekmek istediginiz miktari giriniz: ");
                double miktar= scan.nextDouble();
                if (miktar<=each.getBakiye()){
                    each.setBakiye(each.getBakiye()-miktar);
                    System.out.println("Bakiyeniz: "+each.getBakiye());
                }else{
                    System.out.println("Yetersiz bakiye..");
                    paraCekme();
                }
                flag=false;
            }
        }
         if (flag){
             System.out.println("Hatali giris yaptiniz..");
             paraCekme();

         }
    }

    private void paraCekme() {

    }

    void paraGonderme(){

         }
}

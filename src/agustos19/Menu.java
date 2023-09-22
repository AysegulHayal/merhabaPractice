package agustos19;

import java.util.Scanner;

public class Menu {
    static Scanner scan=new Scanner(System.in);

    static void menu(){
        System.out.print("Secmek istediginiz geometrik sekli giriniz:\n"+
                           "1.Cember\n"+
                           "2.Dikdortgen\n"+
                           "3.Kare\n"+
                           "4.Cikis\n"+
                           "Seciminiz: ");
        int secim =scan.nextInt();
        switch (secim){
            case 1:{
                cemberOlustur();
            }
            case 2:
                dikdortgenOlustur();
            case 3:
                kareOlustur();
            case 4:
                System.exit(0);
            default:{
                System.out.println("yanlis deger girdiniz..");
                menu();
            }
        }

    }

    private static void kareOlustur() {
        System.out.println("karenin kenar uzunlugunu giriniz: ");
        double kenarUzunlugu=scan.nextDouble();
        Kare kare = new Kare(kenarUzunlugu,kenarUzunlugu);
        System.out.println(kare);
        menu();
    }

    private static void dikdortgenOlustur() {
        System.out.println("uzun kenari giriniz: ");
        double uzunKenar=scan.nextDouble();
        System.out.println("kisa kenari giriniz: ");
        double kisaKenar=scan.nextDouble();
        Dikdortgen dikdortgen=new Dikdortgen(uzunKenar,kisaKenar);
        System.out.println(dikdortgen);
        menu();
    }

    private static void cemberOlustur() {
        System.out.println(" Cemberin yaricapini giriniz: ");
        double yariCap=scan.nextDouble();
        Cember cember = new Cember(yariCap);
        System.out.println(cember);
    }
}

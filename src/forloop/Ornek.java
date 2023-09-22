package forloop;

import java.util.Scanner;

public class Ornek {
    public static void main(String[] args) {
        // 10 sayinin ortalamasini bulalim

        int sayac=0;
        double toplam= 0.0;
        Scanner scan = new Scanner(System.in);
        while (sayac<10){
            System.out.println("Lutfen sayi giriniz: ");
            double sayi= scan.nextDouble();
            sayac++;
            toplam+=sayi;
        }
        double ortalama = toplam/10;
        System.out.println("ortalama: "+ ortalama);

    }

}

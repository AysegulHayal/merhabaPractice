package forloop;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iki pozitif tamsayi giriniz: ");
        int ilkSayi = scan.nextInt();
        int ikinciSayi = scan.nextInt();
        if (ilkSayi > ikinciSayi) {
            System.out.println("Ilk sayi ikinci sayidan kucuk olmalidir!");
        } else {
            for (int i = ilkSayi; i <= ikinciSayi; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");

                }

            }
        }
    }
}
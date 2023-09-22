package forloop;

import java.util.Scanner;

public class ForLoop2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz");
        int a = scan.nextInt();
        int b = scan.nextInt();

        int toplam = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                toplam += i;
            }
        } else {
            for (int i = a; i >= b; i--) {
                toplam += i;
            }

        }
        System.out.println(toplam);
    }
}
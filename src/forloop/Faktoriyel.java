package forloop;

import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        /*
        5!=5*4*3*2*1 = 120 seklinde yazdirin
         */
        int sayi = 5;
        int fktryl = 1;
        for (int i = sayi; i >= 1; i--) {
            fktryl *= i;

        }
        String sonuc = sayi + " 1 ";
        for (int i = sayi; i >= 1; i--) {
            fktryl *= i;
            if (i != 1) {
                System.out.println(i + " * ");
            } else {
            }
            System.out.println("1 = ");

        }
    }

}

package forloop;

import java.util.Scanner;

public class ForLoop4 {
    public static void main(String[] args) {
        //verilen bir sayinin faktöriyel degerini bulun
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        int sayi = scan.nextInt();
        int carpim = 1;
        for (int i = 1; i <= sayi; i++) {
            carpim *= i;
        }
            System.out.println("Sayinin faktöriyeli: " + sayi +"!="+ carpim);


    }
}
/*
int sayi= 7;
int faktoriyel=1;
for(int i=sayi; i>=1;i--) {
faktoriyel *= i;
}
system.out.println(faktoriyel);
 */
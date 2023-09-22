package forloop;

import java.util.Scanner;

public class ornek2b {
    public static void main(String[] args) {
        //Kullanici tarfindan girilen metni terse ceviren method olusturun
        Scanner scan = new Scanner(System.in);
        System.out.println("Kelime yaziniz: ");
        String metin= scan.nextLine();
        System.out.println(tersiniYaz(metin));

    }

    protected static String tersiniYaz(String metin) {
        String sonuc = "";
        int i;
        for (int j = metin.length(); j >0 ; j--) {
            sonuc += metin.charAt(j);

        }
        return sonuc;
    }
}

import java.util.Scanner;

public class sezarSifreleme {
    public static void main(String[] args) {
        System.out.println("Sifrelenecek metni giriniz: ");
        Scanner scan=new Scanner(System.in);
        String metin= scan.nextLine().toUpperCase();
        System.out.println("Kaydirma miktarini giriniz: ");
        int kaydirma=scan.nextInt();
        sifreleme(metin,kaydirma);
    }

    public static void sifreleme(String metin, int kaydirma) {
      String sifrelenmisMetin = "";
      String alfabe ="ABCDEFGHIJKLMNOPRSTUVWXYZ";
        for (int i = 0; i < metin.length(); i++) {
            char karater = metin.charAt(i);
            int karakterIndex = alfabe.indexOf(karater);
            int yeniIndex = (karakterIndex + kaydirma)%alfabe.length();
            sifrelenmisMetin+=alfabe.charAt(yeniIndex);
        }
        System.out.println("Sifrelenmiş Metin: " + sifrelenmisMetin);
    }
}

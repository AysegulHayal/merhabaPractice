import com.sun.tools.javac.Main;

import java.util.Scanner;

public class kahveOtomat {
  /*  Basit bir Kahve makinesi oluşturun.

 1. Şart
    3 çeşit kahvemiz olsun.
    Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"

    Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
    Örn:
    Hangi Kahveyi İstersiniz?
            1.Türk kahvesi
            2.Filtre Kahve
            3.Americano

 2.Şart
    Kahve seçildikten sonra sistem kullanıcıya "Süt eklemek istemisiniz?(Evet veya Hayır olarak cevaplayınız)

 3.Şart
    Süt tercihi yapıldıktan sonra sistem kullanıcıya "Şeker ister misiniz ? (Evet veya hayır cevabını veriniz)
    sorusunu sorsun.

 4.Şart
    Şeker tercihini yaptıktan sonra sistem kullanıcıya "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.)
    sorusunu sorsun.

    Sonuç
    Siparişlerimizi verdik. Son hali görmek istiyoruz.
    konsola şunu yazdırın örnek :

    Türk Kahvesi orta boy hazırdır. Afiyet olsun !!!*/

    static String kahveCesidi="",sut="", seker="",kahveBoyutu="";
    static Scanner scan = new Scanner(System.in);
    static int sekerMiktari;
    static void menu(){
        System.out.println("************Kahveciye Hoşgeldiniz*************");
        do{
            System.out.println("********MENU*********\n"+
                    "Turk Kahvesi\n"+
                    "Filtre Kahve\n"+
                    "Americano\n"+
                    "Secim: ");
            kahveCesidi = scan.nextLine();
            if (!kahveCesidi.equalsIgnoreCase("turk kahvesi")&&
                !kahveCesidi.equalsIgnoreCase("filtre kahve") &&
                !kahveCesidi.equalsIgnoreCase("americano"))
                System.out.println("Bu urun menude yok...");

        }while (!kahveCesidi.equalsIgnoreCase("turk kahvesi")&&
                !kahveCesidi.equalsIgnoreCase("filtre kahve") &&
                !kahveCesidi.equalsIgnoreCase("americano"));
    }
static  void sutEkleme(){
    System.out.println("Süt eklemek istemisiniz?(Evet veya Hayır olarak cevaplayınız)");
    sut=scan.next();
    if (sut.equalsIgnoreCase("evet"))
        System.out.println("Sut ekleniyor..");
    else
        System.out.println("Sut eklenmiyor..");
    }


    static void sekerEkleme(){
        System.out.println("Şeker ister misiniz ? (Evet veya hayır cevabını veriniz)");
        seker=scan.next();
        if (seker.equalsIgnoreCase("evet")){
            System.out.println("Kac seker istersiniz?: ");
            sekerMiktari=scan.nextInt();
            System.out.println(sekerMiktari+" adet seker ekleniyor..");

        }else
            System.out.println("Seker eklenmiyor..");

}
       static void boyutsorgula(){
        do{
           System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.)");
            scan.nextLine();
           kahveBoyutu=scan.next();
           if (!kahveBoyutu.equalsIgnoreCase("buyuk")&&
               !kahveBoyutu.equalsIgnoreCase("orta")&&
               !kahveBoyutu.equalsIgnoreCase("kucuk"))
               System.out.println("Hatali giris yaptiniz..");

       }while (!kahveBoyutu.equalsIgnoreCase("buyuk")&&
                !kahveBoyutu.equalsIgnoreCase("orta")&&
                !kahveBoyutu.equalsIgnoreCase("kucuk"));
    }
    static void sonuc(){
        if (sut.equalsIgnoreCase("evet"))
            sut="sutlu";
        else
            sut="sutsuz";
        if (seker.equalsIgnoreCase("evet"))
            seker=sekerMiktari+" sekerli";
        else seker="sekersiz";

        System.out.println(sut+ " "+seker+" "+kahveBoyutu+" " +kahveCesidi+" HAZIRDIR. AFİYET OLSUN!!");
    }

    public static void main(String[] args) {
        menu();
        sutEkleme();
        sekerEkleme();
        boyutsorgula();
        sonuc();
    }
}

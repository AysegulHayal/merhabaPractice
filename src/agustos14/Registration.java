package agustos14;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Registration {
    /*
    2- Registration(Kayıt) isminde bir class oluşturun ve register()(kayıtAl()) isminde bir metod
     ekleyerek Kullanıcıdan user ismini alarak ArrayList e ekleyin ve bu list i
     return edin.
     */

    static ArrayList<User> kullanicilar = new ArrayList<>(); //bu arraylistin icinde user tipinde veriler tutulacak
    static Scanner scan = new Scanner(System.in);
    static ArrayList<User> register(){
        System.out.print("Isminizi giriniz: ");
        String name= scan.nextLine();
        LocalDateTime time =LocalDateTime.now();
        User kullanici =new User(name,time); // p'li cons. kullanarak user classından obje olusturduk
        kullanicilar.add(kullanici);

         return kullanicilar;
    }
    static void printHappyUser(ArrayList<User> list){
        for (User each : list) {
          /* 3- Registration(Kayıt) classı na aynı zamanda kendine verilen
     ArrayListteki userlardan(kullanıcı) her dakikanın ilk 10  saniyesinde kaydolanları
     yazdıran printHappyUsers(sanslıKullanıcı) isminde bir metod daha ekleyiniz.*/
            if (each.registerTime.getSecond()<10){
                System.out.println(each.name + "hadi iyisin");
            }else {
                System.out.println(each.name + " bu sefer olmadi..");
            }
        }
    }
    void kullaniciListesi(ArrayList<User> list){
        for (User each:list){
            System.out.println("isim: " +each.name+ " Kayit zamani: "+each.registerTime);

        }
    }
}

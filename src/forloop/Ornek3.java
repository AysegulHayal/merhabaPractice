package forloop;

import java.util.Arrays;

public class Ornek3 {
    public static void main(String[] args) {
        //bir tamsayi dizisindeki en büyük ikinci sayiyi bulunuz.2. çözüm method ile bulunuz
        Integer[] arr = {21,85,13,90,45};
        enBuyukIkinci(arr);
        System.out.println(ikinciyiBul(arr));
    }





    private static void ikinciyiBul(Integer[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Array in en büyüyk 2. elemani : "+arr[(arr.length-2)] + " 'dir.");

    }
public static Integer ikinciSayiyiBul(Integer[] arr){
        int a= Integer.MAX_VALUE;
        int b=
}
}
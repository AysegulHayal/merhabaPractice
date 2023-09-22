import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class binary {
    /*
    girilen desimal degeri binary degere cevirme metodu olusturunuz.Ornek 12= 1 1 0 0
     */
    public static void main(String[] args) {
        System.out.println("Desimal deger giriniz: ");
        Scanner scan=new Scanner(System.in);
        int sayi= scan.nextInt();
        System.out.println(sayi + " desimal sayinin binary karsiligi: "+ binaryconvert(sayi));
    }

    public static List<Integer> binaryconvert(int sayi) {
        List<Integer> binary = new ArrayList<>();
        while (sayi>0){
            binary.add(sayi%2);
            sayi/=2;
        }
        /*
        List<Integer> tersBinary = new ArrayList<>();
        for (int i = binary.size()-1; i >=0 ; i--) {
            tersBinary.add(binary.get(i));

        }*/

        Collections.reverse(binary);
        return binary;
    }
}

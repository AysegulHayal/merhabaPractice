import java.util.Arrays;
import java.util.Scanner;

public class mountainArray {
    /*
Mountain Array : Verilen herhangi arrayin Mountain array olup olmadigini kontrol ediniz.
Mountain Array ==>[0,2,5,3,1]
Bir array elmanlari en buyuk degerine kadar surekli artan, en buyuk degerden sonra  surekli azalan deger
aliyorsa"Mountain Array" dir
Mountain array degildir ==>[5,2,7,1,4]
     */
    public static void main(String[] args) {
        System.out.println("Mountain array kontrolu yapilacak degerlerin arasine virgül koyarak giriniz: ");
        Scanner scan = new Scanner(System.in);
        String degerler = scan.next();
        String[] degerlerArr = degerler.split(",");
        mountainArrControl(degerlerArr);

        }
        private static void mountainArrControl(String[] degerlerArr) {
        int enBuyukDegerIndex = 0, enBuyukDeger = 0;
        boolean control = false;

        for (int i = 0; i < degerlerArr.length; i++) {
            if (enBuyukDeger < Integer.parseInt(degerlerArr[i])) {
                enBuyukDeger = Integer.parseInt(degerlerArr[i]);
                enBuyukDegerIndex = i;
            }
        }
        // baslangictan en buyuk degere kadar artan kısım kontrolu
        for (int i = 0; i < enBuyukDegerIndex; i++) {
            if (i != enBuyukDegerIndex) {
                if (Integer.parseInt(degerlerArr[i]) < Integer.parseInt(degerlerArr[i + 1])) {
                    control = true;
                } else {
                    control = false;
                    break;
                }
                }
            }
            //en buyuk degerden son indexe kadar azalan kontrolu
            for (int i = enBuyukDegerIndex; i < degerlerArr.length; i++) {
                if (i != degerlerArr.length - 1) {
                    if (Integer.parseInt(degerlerArr[i]) > Integer.parseInt(degerlerArr[i + 1])) {
                       control = true;
                    } else {
                        control = false;
                        break;
                    }
                }
            }
            if (control) {
                System.out.println(Arrays.toString(degerlerArr) + " arrayi mountain arraydir");
            } else {
                System.out.println(Arrays.toString(degerlerArr) + " arrayi mountain array degildir");
            }
        }
    }



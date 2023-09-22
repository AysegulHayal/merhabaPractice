package forloop;

public class ornek2 {
    public static void main(String[] args) {
        //Verilen metni tersine ceviren method
        String a ="oldumukiz";
        System.out.println(a);
        System.out.println("a nin ters cevrilmis hali : "+ tershali(a));
    }

    private static String tershali(String a) {
        String[] b = a.split(" ");
        StringBuilder c= new StringBuilder();
        for (String each:b) {
            c.append(new StringBuilder(each).reverse());
        }
        return c.toString();
    }


}

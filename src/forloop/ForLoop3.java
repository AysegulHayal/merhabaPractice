package forloop;

public class ForLoop3 {
    public static void main(String[] args) {
        String str = "Java iyi ogrenen once isi kapar";
        int bHs = 0;
        int kHs = 0;
        int spaceS = 0;

        for (int index = 0; index < str.length(); index++) {
            char karakter = str.charAt(index);
            if (karakter >= 'a' && karakter <= 'z') {
                kHs++;
            } else if (karakter >= 'A' && karakter <= 'Z') {
                bHs++;

            } else if (karakter == ' ') {
                spaceS++;
            }
        }
        System.out.println("Metindeki kelime sayisi: " + (spaceS + 1) +
                "\nküçük harf sayisi: " + kHs +
                "\nbüyük harf sayisi: " + bHs);
    }
}
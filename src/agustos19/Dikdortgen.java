package agustos19;

public class Dikdortgen extends Sekil{
    public Dikdortgen(double uzunKenar, double kisaKenar) {
        super(uzunKenar, kisaKenar);
    }

    @Override
    public String toString() {
        return "uzunKenar=" + uzunKenar +
                ", kisaKenar=" + kisaKenar + " cevresi=" + cevreHesaplama(uzunKenar,kisaKenar)+ ", alani= "+alanHesapla(uzunKenar,kisaKenar);
    }
}

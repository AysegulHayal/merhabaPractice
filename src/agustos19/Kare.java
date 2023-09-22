package agustos19;

public class Kare extends Dikdortgen{
    public Kare(double uzunKenar, double kisaKenar) {
        super(uzunKenar, kisaKenar);
    }

    @Override
    public String toString() {
        return "Kenar uzunlugu="+ uzunKenar + "Cevre= "+ cevreHesaplama(uzunKenar,kisaKenar)+" Alan= "+ alanHesapla(uzunKenar,kisaKenar);
    }
}

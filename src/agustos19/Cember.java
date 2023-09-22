package agustos19;

public class Cember extends Sekil{
    public Cember(double yariCap) {
        super(yariCap);
    }

    @Override
    public String toString() {
        return "Yaricap=" + yariCap + " Alan= "+ alanHesapla(yariCap)+" Cevre= "+cevreHesaplama(yariCap);
    }
}

public class BaseKrediManager {
    public double hesapla(double tutar) {
        return tutar * 1.18;
    }

    // final = can not override method
    public final double hesapla2(double tutar){
        return tutar * 1.10;
    }

}

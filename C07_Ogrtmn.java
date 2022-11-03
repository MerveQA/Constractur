package j18_Constractor;

public class C07_Ogrtmn {

    String isim;
    int tecrube;
    int kidem=5;

    public C07_Ogrtmn(String isim, int tecrube) {
        this.isim = isim;
        this.tecrube = tecrube;
    }

    public void kidemHesap(int kidem){
        System.out.println("agam kidemin : "+(kidem*2));
        System.out.println("agam kidemin : "+(this.kidem*2));
    }
}

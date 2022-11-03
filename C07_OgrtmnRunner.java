package j18_Constractor;

public class C07_OgrtmnRunner {

    public static void main(String[] args) {

        C07_Ogrtmn hcm = new C07_Ogrtmn("Sevde Nur",11);
        System.out.println("hcm.isim = " + hcm.isim);
        System.out.println("hcm.kidem = " + hcm.kidem);
        hcm.kidemHesap(13);
    }
}

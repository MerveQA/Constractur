package j18_Constractor.TEKRAR;

import java.util.ArrayList;
import java.util.Arrays;

public class C20_Ogretmen {

    String brans ;
    int [] siniflar;
    ArrayList<String> subeler;

    public C20_Ogretmen(ArrayList<String> subeler) {
        this.subeler = subeler;
    }

    public C20_Ogretmen(String brans, int[] siniflar) {
        this.brans = brans;
        this.siniflar = siniflar;
    }

    public C20_Ogretmen() {
    }

    @Override
    public String toString() {
        return "C20_Ogretmen{" +
                "brans='" + brans + '\'' +
                ", siniflar=" + Arrays.toString(siniflar) +
                ", subeler=" + subeler +
                '}';
    }
}

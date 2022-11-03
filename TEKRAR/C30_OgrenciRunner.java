package j18_Constractor.TEKRAR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C30_OgrenciRunner {
    public static void main(String[] args) {

        C30_Ogrenci ogrenci = new C30_Ogrenci(1246,"Merve",new ArrayList<String>(List.of("mat","fen")),new String []{"resim","muzik"});
        System.out.println(ogrenci.name);
        System.out.println(ogrenci.ogrnciNo);
        System.out.println(Arrays.toString(ogrenci.kusrlar));
        System.out.println(ogrenci.dersler);
        System.out.println(ogrenci);

        ogrenci.kursUcret(new String[]{"resim", "muzik"});

    }
}



package j18_Constractor.TEKRAR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C20_OgretmenRunner {
    public static void main(String[] args) {

    C20_Ogretmen ogrtmn01 = new C20_Ogretmen();
    C20_Ogretmen ogrtmn02 = new C20_Ogretmen("Matematik", new int[]{6, 7, 8});
    C20_Ogretmen ogrtmn03 = new C20_Ogretmen(new ArrayList<>(List.of("A","B","C","D")));

        System.out.println(ogrtmn01);
        // C20_Ogretmen{brans='null', siniflar=null}
        System.out.println(ogrtmn02);
        // C20_Ogretmen{brans='Matematik', siniflar=[6, 7, 8]}
        System.out.println(ogrtmn03);
        // C20_Ogretmen{brans='null', siniflar=null, subeler=[A, B, C, D]}
        System.out.println(ogrtmn03.subeler);
        // [A, B, C, D]
        System.out.println(Arrays.toString(ogrtmn02.siniflar));
        // [6, 7, 8]
    }
}

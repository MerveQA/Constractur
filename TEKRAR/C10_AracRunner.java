package j18_Constractor.TEKRAR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C10_AracRunner {

    public static void main(String[] args) {

        C10_Arac arb01 = new C10_Arac("Beyaz", 280);
        C10_Arac arb02 = new C10_Arac();

        System.out.println(arb01.renk);  // Beyaz
        System.out.println(arb02.renk);  // null
        arb02.renk = "Sari";
        System.out.println(arb02.renk);  // Sari

        System.out.println(arb01);
        System.out.println(arb02);



    }
}


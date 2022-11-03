package j18_Constractor.TEKRAR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C30_Ogrenci {

    int ogrnciNo ;
    String name;
    ArrayList<String> dersler ;
    String [] kusrlar ;

    public C30_Ogrenci() {
    }

    public C30_Ogrenci(int ogrnciNo, String name, ArrayList<String> dersler, String[] kusrlar) {
        this.ogrnciNo = ogrnciNo;
        this.name = name;
        this.dersler = dersler;
        this.kusrlar = kusrlar;
    }

    @Override
    public String toString() {
        return "C30_Ogrenci{" +
                "ogrnciNo=" + ogrnciNo +
                ", name='" + name + '\'' +
                ", dersler=" + dersler +
                ", kusrlar=" + Arrays.toString(kusrlar) +
                '}';
    }

    public void kursUcret( String [] kusrlar ){
        // 1.yol ( contains kullanacaksak arrayi arrayList olarak kullanmaliyiz .)
        List<String> intList = new ArrayList<>(Arrays.asList(kusrlar));
        int toplam=0;
        if(intList.contains("resim")){
         toplam+=300;
        }
        if(intList.contains("muzik")){
            toplam+=400;
        }
        System.out.println(toplam);

        // 2.yol for each ile direk arrayin icine bakma
        int toplam2 =0;
        for(String s : kusrlar){
            if(s.equalsIgnoreCase("resim")){
              toplam2+=300;
            }
            if(s.equalsIgnoreCase("muzik")){
                toplam2+=400;
            }
        }

        System.out.println(toplam2);

    }
}

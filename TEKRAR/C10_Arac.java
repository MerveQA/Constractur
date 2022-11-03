package j18_Constractor.TEKRAR;

public class C10_Arac {

    String renk;
    int maxHiz;

    public C10_Arac(String renk, int maxHiz) {
        this.renk = renk;
        this.maxHiz = maxHiz;
    }

    public C10_Arac() {
    }

    @Override
    public String toString() {
        return "C10_Arac{" +
                "renk='" + renk + '\'' +
                ", maxHiz=" + maxHiz +
                '}';
    }
}

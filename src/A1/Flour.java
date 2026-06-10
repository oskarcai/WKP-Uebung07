package A1;

public class Flour extends PFood {

    // Konstruktor:
    public Flour(int a, int d, int p) {
        super(p);
        disQuantity = d;
        amount = a;
        household = 15;
    }

    // überschriebene Methode aus Oberklasse Article (abstrakt):
    @Override
    public int discountQuantity() {
        return amount >= disQuantity? 5 : 0;
    }
}

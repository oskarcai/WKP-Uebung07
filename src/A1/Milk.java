package A1;

public class Milk extends PFood {

    // Konstruktor:
    public Milk (int a, int d, int p) {
        super(p);
        disQuantity = d;
        amount = a;
        household = 20;
    }

    // überschriebene Methode aus Oberklasse Article (abstrakt):
    @Override
    public int discountQuantity() {
        return amount >= disQuantity? 12 : 0;
    }
}

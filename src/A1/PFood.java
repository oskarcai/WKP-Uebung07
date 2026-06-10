package A1;

public abstract class PFood extends Food {
    int popularity; // Beliebtheitsgrad
    int amount; // Anzahl

    public PFood(int popularity) {
        popular = true;
        this.popularity = popularity;
    }

    // überschriebene Methode aus Oberklasse Article (abstrakt):
    @Override
    public boolean warning() {
        return amount > household;
    }

    // Setter
    public void setAmount(int amount) {
        this.amount = amount;
    }
}

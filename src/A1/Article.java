package A1;

public abstract class Article {
    int disQuantity; // Menge, ab welcher auf einen Artikel Mengenrabatt gewährt wird
    int household; // haushaltsübliche Menge und darf beim Einkauf nicht überschritten werden


    // abstrakte Methoden:
    public abstract int discountQuantity();
    public abstract boolean warning();
}

package A2;

import java.util.List;

public class ShoppingList {

    /*
    – Die Methode erwartet eine beliebige Anzahl von Artikelnamen als Parameter.
    – Als Rückgabewert liefert die Methode eine List<String>, die mit Hilfe von
    List.of(...) erzeugt wird
     */
    public static List<String> createList(String... articleName) {
        List <String> shoppingList = List.of(articleName);
        return shoppingList;

        // funktioniert auch Inline mit: return List.of(articleName);
    }
}

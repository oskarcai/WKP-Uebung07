package A2;

import java.util.List;

public class Demo {

    /*
    – Erzeugen Sie mit Hilfe der Methode createList eine Liste mit den Einträgen
    "Milch", "Mehl", "Butter" und "Zucker".
    – Speichern Sie die zurückgegebene Liste in einer geeigneten Variablen.
    – Geben Sie anschließend alle Elemente der Liste mit einer for-each-Schleife auf der
    Konsole aus.
     */

    public static void main(String[] args) {
        List <String> list = ShoppingList.createList("Milch", "Mehl", "Butter", "Zucker");
        list.add("toast");

        for (String article : list) {
            System.out.print("[");
            System.out.print(article);
            System.out.print("]");
        }
    }
}

/*
         Beantworten Sie die folgende Frage:

        – Was passiert, wenn nach der Erzeugung der Liste versucht wird,
        mit add(...) ein weiteres Element einzufügen?
        – Begründen Sie Ihre Antwort kurz.

        -> funktioniert nicht, da Liste aufgrund von List.of(...) immutable (unveränderlich) ist
        -> Exception "UnsupportedOperationException" wird geworfen
 */

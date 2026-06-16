package A4;

import java.util.HashSet;

public class A4_Main {
    public static void main(String[] args) {

        HashSet <Kinoticket> set = new HashSet<>();
        set.add(new Kinoticket(1, 2, 3));
        set.add(new Kinoticket(1, 2, 3));
        set.add(new Kinoticket(3, 2, 3));
        set.add(new Kinoticket(2, 2, 3));
        set.add(new Kinoticket(1, 2, 3));
        set.add(new Kinoticket(2, 2, 3));

        System.out.println("HashSet hat die Größe: " + set.size());

        // Ausgabe
        for (Kinoticket ticket : set) {
            System.out.println(ticket);
        }

        /*
            – Was passiert, wenn Sie hashCode() nicht überschreiben, obwohl equals(...) korrekt
             implementiert ist?
             – Warum kann es dann zu „duplizierten“ Objekten im HashSet kommen?

             -> es kann dann zu Duplikaten von Objekten im HashSet kommen, trotz gleichem Inhalt
             -> weil equals(Object obj) zwar true zurückgibt, aber beide Objekte im hashCode() nicht übereinstimmen,
                sie sind dann sozusagen zwar inhaltlich gleich, aber dennoch "in unterschiedlichen Regalen gelagert"
                -> HashSet überprüft erst...
                    - Gleichheit vom hashCode beider Objekte
                    - ob equals() true zurückgibt
                    nur wenn hashCode() gleich und equals() true ist, erkennt HashSet Duplikate korrekt
         */





        HashSet <Visitor> visitorSet = new HashSet<>();
        visitorSet.add(new Visitor(1, "Anna"));
        visitorSet.add(new Visitor(1, "Anna"));
        visitorSet.add(new Visitor(2, "Ben"));
        visitorSet.add(new Visitor(3, "Clara"));

        System.out.println("HashSet für Visitors hat die Größe: " + visitorSet.size());

        // Ausgabe
        for (Visitor visitor : visitorSet) {
            System.out.println(visitor);
        }
    }
}
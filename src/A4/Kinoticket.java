package A4;

import java.util.Objects;

public class Kinoticket {
    int date, time, seat;

    // Konstruktor
    public Kinoticket(int date, int time, int seat) {
        this.date = date;
        this.time = time;
        this.seat = seat;
    }

    // wir überschreiben die nicht-statische Objektmethode equals(Object obj) von Object,
    // die 2 Kinoticket-Objekte auf deren Inhalt vergleichen soll
    @Override
    public boolean equals(Object obj) {
        // wenn übergebenes Objekt null ist -> equals() ist direkt false
        if(obj == null) return false;
        // wenn die Laufzeittypen beider Objekte (Klassen zur Laufzeit) unterschiedlich sind -> equals() ist direkt false
        if(this.getClass() != obj.getClass()) return false;

        // eigentliche Gleichheitslogik (immer selbst definiert!)
        Kinoticket other = (Kinoticket) obj;

        return other.date == this.date && other.time == this.time && other.seat == this.seat;
    }

    // wir überschreiben die nicht-statische Objektmethode hashCode() von Object,
    // die den hashCode eines Kinoticket-Objekts berechnet
    @Override
    public int hashCode() {
        return Objects.hash(date, time, seat);
    }

    // wir überschreiben die nicht-statische Objektmethode toString() von Object
    @Override
    public String toString() {
        return "[" + "Datum: " + date + " Uhrzeit: " + time + " Sitzplatz: " + seat + "]";
    }

}

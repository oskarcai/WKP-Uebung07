package A3;

// Top-Level-Enum = eigene Datei, außerhalb jeder Klasse:
// (Nested = innerhalb einer anderen Klasse definiert)
public enum MutationStage { // -> Top-Level-Enum
    FOOTNOTE, SMALL, NORMAL, LARGE, HUGE
}


/*  e)
        Angenommen, das Enum wird später um die zusätzliche Konstante
        FOOTNOTE, TINY, SMALL, NORMAL, LARGE, HUGE
        erweitert.
        Welche der von Ihnen implementierten Methoden funktionieren weiterhin kor
        rekt, ohne dass Änderungen am Programmcode notwendig sind? Begründen Sie
        Ihre Antwort

        -> Alle drei Methoden funktionieren weiterhin korrekt 🎯
        -> Weil du nie mit festen Ordinalzahlen gearbeitet hast (keine magic numbers wie values()[3]),
            sondern immer relativ und dynamisch (ordinal() + 1, values().length, compareTo()),
            ist dein Code robust gegen Erweiterungen des Enums.
 */
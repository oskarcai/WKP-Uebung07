package A3;

import java.util.Random;

public class GamePiece {
    MutationStage stage;

    // Konstruktor
    public GamePiece(MutationStage stage) {
        this.stage = stage;
    }

    public void nextStage() {
        MutationStage[] values = MutationStage.values();
        int ordinal = stage.ordinal();
        if(ordinal < values.length - 1) {
            stage = values[ordinal + 1];
        }
    }

    public static GamePiece randomPiece() {
        Random random = new Random();  // Zufallsgenerator / Würfel -> Objekt erstellt
        int ordinal = random.nextInt(MutationStage.values().length); // .nextInt(...) -> Zufallszahl generieren / Würfelwurf
        // random.nextInt(n) gibt random Zahl zwischen 0 und n-1 zurück

        GamePiece gamePiece = new GamePiece(MutationStage.values()[ordinal]);

        return gamePiece;
    }

    public static GamePiece moreMutuated(GamePiece a, GamePiece b) {
        if (a.stage.compareTo(b.stage) >= 0) {
            return a;
        } else {
            return b;
        }
    }
}

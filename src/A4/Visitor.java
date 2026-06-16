package A4;

import java.util.Objects;

public class Visitor {
    private int id;
    private String name;

    public Visitor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(!(obj instanceof Visitor)) return false;
        // if(this.getClass() != obj.getClass()) return false; geht auch
        // --> instanceof-Vergleich ist allgemein sicherer als .getClass()-Vergleich

        Visitor other = (Visitor) obj;
        return this.id == other.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}

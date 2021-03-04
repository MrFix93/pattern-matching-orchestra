package nl.infosupport.models;

import java.util.Set;
import nl.infosupport.Visitor;

public class InstrumentFamily extends Musical {
    protected final boolean isPrincipal;
    protected final String name;

    public InstrumentFamily(boolean isPrincipal, String name) {
        this.isPrincipal = isPrincipal;
        this.name = name;
    }

    public static InstrumentFamily ensemble(Musical... musicals) {
        InstrumentFamily instrumentFamily = new InstrumentFamily(false, "InstrumentFamily");
        instrumentFamily.musicalPeople.addAll(Set.of(musicals));
        return instrumentFamily;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String play() {
        return "InstrumentFamily is playing...";
    }

    @Override
    public boolean isPrincipal() {
        return isPrincipal;
    }
}

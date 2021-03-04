package nl.infosupport.models;

import nl.infosupport.Visitor;

public class Trumpet extends InstrumentFamily {
    public Trumpet(boolean isPrincipal, String name) {
        super(isPrincipal, name);
    }

    @Override
    public String play() {
        return "Braaap!";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return String.format("Trumpet player(isPrincipal=%s, name=%s)", isPrincipal, name);
    }
}

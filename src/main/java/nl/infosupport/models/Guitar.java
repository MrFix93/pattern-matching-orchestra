package nl.infosupport.models;

import nl.infosupport.Visitor;

public class Guitar extends InstrumentFamily {

    public Guitar(boolean isPrincipal, String name) {
        super(isPrincipal, name);
    }

    @Override
    public String play() {
        return "Pling";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return String.format("Guitar player(isPrincipal=%s, name=%s)", isPrincipal, name);
    }
}

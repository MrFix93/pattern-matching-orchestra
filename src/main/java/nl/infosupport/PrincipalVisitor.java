package nl.infosupport;

import nl.infosupport.models.*;

import java.util.ArrayList;
import java.util.List;
import nl.infosupport.models.Guitar;
import nl.infosupport.models.InstrumentFamily;
import nl.infosupport.models.Musical;

public class PrincipalVisitor implements Visitor {
    private List<Musical> principles = new ArrayList<>();

    @Override
    public void visit(Musical node) {
        node.getMusicalPeople().forEach(musician -> musician.accept(this));
    }

    @Override
    public void visit(Guitar node) {
        if (node.isPrincipal()) {
            this.principles.add(node);
        }
    }

    @Override
    public void visit(Trumpet node) {
        if (node.isPrincipal()) {
            this.principles.add(node);
        }
    }

    @Override
    public void visit(Vocal node) {
        if (node.isPrincipal()) {
            this.principles.add(node);
        }
    }

    public List<Musical> getPrinciples() {
        return principles;
    }
}

package nl.infosupport;

import nl.infosupport.models.*;
import nl.infosupport.models.Guitar;
import nl.infosupport.models.InstrumentFamily;
import nl.infosupport.models.Musical;

public interface Visitor {
    void visit(Musical node);

    void visit(Guitar node);
    void visit(Trumpet node);
    void visit(Vocal node);
}

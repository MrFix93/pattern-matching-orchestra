package nl.infosupport.models;

import java.util.Set;
import nl.infosupport.Visitor;

public class VocalFamily extends Musical {

    public static VocalFamily ensemble(Musical... musicals) {
        VocalFamily vocalFamily = new VocalFamily();
        vocalFamily.musicalPeople.addAll(Set.of(musicals));
        return vocalFamily;
    }

    @Override
    public String play() {
        return "VocalFamily is singing...";
    }

    @Override
    public boolean isPrincipal() {
        return false;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

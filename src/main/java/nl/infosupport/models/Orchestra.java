package nl.infosupport.models;

import java.util.Set;

public class Orchestra extends Musical {
    public static Orchestra ensemble(Musical... musicals) {
        Orchestra orchestra = new Orchestra();
        orchestra.musicalPeople.addAll(Set.of(musicals));
        return orchestra;
    }

    @Override
    public boolean isPrincipal() {
        return false;
    }
}

package nl.infosupport.models;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import nl.infosupport.Visitor;

public abstract class Musical {
    protected Set<Musical> musicalPeople;

    protected Musical() {
        musicalPeople = new HashSet<>();
    }

    public String play() {
        return musicalPeople.stream().map(Musical::play).collect(Collectors.joining(System.lineSeparator()));
    }

    public abstract boolean isPrincipal();

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public Set<Musical> getMusicalPeople() {
        return musicalPeople;
    };
}

package nl.infosupport.models;

import nl.infosupport.Visitor;

public class Vocal extends Musical {
    private int index;
    private String name;

    public Vocal(String name, int index) {
        this.index = index;
        this.name = name;
    }

    public static Vocal leadSinger(String name) {
        return new Vocal(name, 0);
    }
    public static Vocal backgroundSinger(String name) {
        return new Vocal(name, 1);
    }

    @Override
    public String play() {
        return "Singer is singing...";
    }

    @Override
    public boolean isPrincipal() {
        return getIndex() == 0;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getIndex() {
        return index;
    }

    public String toString() {
        return String.format("Singer(index=%s, name=%s)", index, name);

    }
}

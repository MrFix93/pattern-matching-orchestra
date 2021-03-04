package nl.infosupport;

import nl.infosupport.models.Orchestra;
import nl.infosupport.models.*;
import nl.infosupport.models.Guitar;

public class Main {

    public static void main(String[] args) {

        final Orchestra orchestra = Orchestra.ensemble(
                InstrumentFamily.ensemble(
                        new Guitar(true, "Peter"),
                        new Guitar(false, "Hanno"),
                        new Guitar(false, "Tom")
                ),
                InstrumentFamily.ensemble(
                        new Trumpet(true, "Wilco"),
                        new Trumpet(false, "Max")
                ),
                VocalFamily.ensemble(
                        Vocal.leadSinger("Raymond"),
                        Vocal.backgroundSinger("Daan"),
                        Vocal.backgroundSinger("Hanno")
                )
        );

        System.out.println(orchestra.play());

        final PrincipalVisitor principalVisitor = new PrincipalVisitor();
        principalVisitor.visit(orchestra);

        System.out.println(principalVisitor.getPrinciples());
    }
}

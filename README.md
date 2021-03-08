# Pattern Matching Orchestra examples

This project exists to provide code examples that accompany the article "Pattern Matching maakt Java in de komende jaren nóg krachtiger" that appeared in [Java Magazine](https://nljug.org/java-magazine) #2-2021.

## Premise

The code in this project focuses on representing data on an *orchestra* and its *musicians*. 
Every contributing member to the orchestra is modeled as a sub class of the `Musical` abstract class.
An orchestra - or any musical group for that matter - can be modeled as a `Set` of `Musical`s.

## Factory method `ensemble`

An orchestra can be created as follows:

```
Orchestra twoTrumpetPlayers = Orchestra.ensemble(
      new Trumpet(true, "Wilco"), 
      new Trumpet(false, "Max")
);
Orchestra twoSingers = Orchestra.ensemble(
      Vocal.leadSinger("Raymond"), 
      Vocal.backgroundSinger("Daan")
);
Orchestra brassBand = Orchestra.ensemble(
      new Guitar(true, "Peter"), 
      new Trumpet(true, "Wilco"), 
      Vocal.leadSinger("Raymond")
);
```

## Grouping

Big orchestras are organized by defining *instrument families*. These `*Family` classes are all sub classes of `Musical`.

```
Orchestra philharmonic = Orchestra.ensemble(
      InstrumentFamily.ensemble(
            new Guitar(true, "Peter"), 
            new Guitar(false, "Tom")
      ),
      InstrumentFamily.ensemble(
            new Trumpet(true, "Wilco"), 
            new Trumpet(false, "Max")
      ),
      InstrumentFamily.ensemble(
            new Violin(true, "Topol"),
            new Violin(false, "André"),
            new Violin(false, "Henrietta")
      ),
      InstrumentFamily.ensemble(
            new Drums(true, "Phil"), 
            new Timpani(true, "Julia"), 
            new Triangle(true, "Smee")
      ),
      VocalFamily.ensemble(
            Vocal.leadSinger("Raymond"), 
            Vocal.backgroundSinger("Daan"), 
            Vocal.backgroundSinger("Hannah")
      )
);
```

# Outline for the Bloackjack Program

## Project Layout
```
blackjack/
└── src/
    └── com.yourname.blackjack/
        ├── game/
        │   └── BlackjackGame.java
        ├── model/
        │   ├── Card.java
        │   ├── Deck.java
        │   ├── Hand.java
        │   ├── Rank.java
        │   └── Suit.java
        └── actor/
            ├── Player.java
            └── Dealer.java
```

## Breakdown

### Game

This serves as the entry point for the program.  This does not control any logic.

### Model

This is where the models for cards, are held.  Logic involving cards are held by their respective classes.

#### Card.java

Using the Rank and Suit, defines each card.

#### Deck.java

Creates a Deck of 52 cards.  Employs methods to shuffle, draw a card (removing it from the deck and giving it to a hand or discarding it), or resetting the deck.

### Hand.java

Creates a Hand object that is owned by an Actor, and owns Cards.  Methods will add cards, check score, check for bust, and clear hand.

#### Rank.java

This defines the "Face" of the card (2 through A), and with it the value of that face.

#### Suit.java

This enum defines the suit of the card.

### Actor

Two actors for the Blackjack Program are Player and Dealer.

#### Player.java

Creates a Player's hand.  Holds information such as the Player's Name, Player's Hand Object, PLayer's money (if betting allowed).  Methods will allow the player to "hit" or "stand."  Later they can "place bet," "split," or "double."

#### Dealer.java

Similar to a Player Actor, but follows a set of rules on when to hit or stand.
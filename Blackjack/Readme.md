# Project 1: Blackjack (Console-Based Java)

## Overview

This project is a fully functional single-player Blackjack game implemented in pure Java using console input/output. The player competes against a dealer that follows standard Blackjack rules.

The purpose of this project is to demonstrate strong object-oriented design, domain modeling, and rule enforcement without the use of GUI frameworks.

## Objectives

- Model a standard 52-card deck.
- Implement official Blackjack gameplay rules.
- Correctly handle Ace dual values (1 or 11).
- Implement dealer decision logic (hit until 17 or higher).
- Support multiple rounds of play.
- Ensure robust input validation.

## Project Structure

### Core Domain Classes

**Suit (enum)**

- Represents card suits: HEARTS, DIAMONDS, CLUBS, SPADES.

**Rank (enum)**

- Represents card ranks.
- Stores Blackjack value for each rank.

**Card**

- Fields:
  - Suit suit
  - Rank rank

- Methods:
  - getValue()
  - toString()

**Deck**

- Fields:
  - List\<Card\> cards

- Methods:
  - shuffle()
  - dealCard()
  - reset()

**Hand**

- Fields:
  - List\<Card\> cards

- Methods:
  - addCard(Card card)
  - getValue()
  - adjustForAces()
  - isBust()
  - toString()

This class contains the core Ace adjustment logic.

**Player**

- Fields:
  - Hand hand
  - int chips (optional enhancement)

- Methods:
  - hit(Deck deck)
  - stand()

**Dealer**

- Extends or composes Hand.
- Enforces rule: must hit until hand value >= 17.

**BlackjackGame**

- Contains:
  - main()
  - Game loop
  - Input handling
  - Round resolution logic

## Game Rules Implemented

- Player and dealer each receive two cards.
- One dealer card is hidden until player turn ends.
- Player may:
  - Hit (draw card)
  - Stand
- Dealer must hit until total is 17 or greater.
- Bust occurs if total exceeds 21.
- Closest value to 21 wins.
- Ties result in a push.

## Key Technical Challenges

### Ace Handling Logic

Aces initially count as 11.  
If the hand value exceeds 21, Aces are reduced from 11 to 1 until the hand is valid or no Aces remain.

### Input Validation

- Reject invalid commands.
- Prevent crashes due to malformed input.
- Loop until valid input is provided.

### State Management

- Separate round logic from player/dealer modeling.
- Avoid placing game logic inside main().

## Enhancements

- Betting system
- Persistent chip tracking
- Blackjack payout (3:2)
- Double down
- Split hands

# Project 2: Minesweeper (JavaFX)

## Overview

This project is a fully functional Minesweeper game built using JavaFX. It demonstrates grid-based game logic, recursion, event-driven programming, and separation between UI and business logic.

The project emphasizes architectural design and clean separation of concerns using a model-driven approach.

## Objectives

- Implement a grid-based Minesweeper board.
- Randomly distribute mines.
- Calculate adjacent mine counts.
- Implement recursive flood-fill reveal logic.
- Support flagging functionality.
- Detect win and loss conditions.
- Maintain separation between game logic and UI.

## Technologies Used

- Java (JDK 17+)
- JavaFX
- AnimationTimer (optional for timer feature)
- GridPane layout
- Event handling (mouse events)

## Architecture Overview

The project follows a Model–View–Controller style separation.

### Model Layer (No JavaFX Dependencies)

**Cell**

- Fields:
  - boolean isMine
  - boolean isRevealed
  - boolean isFlagged
  - int adjacentMines
- Methods:
  - reveal()
  - toggleFlag()
  - getters

**Board**

- Fields:
  - Cell[][] grid
  - int rows
  - int cols
  - int mineCount
- Methods:
  - placeMines()
  - calculateAdjacencies()
  - revealCell(int row, int col)
  - revealNeighbors(int row, int col)
  - checkWin()

All game rules exist here.

### View / Controller Layer (JavaFX)

**MinesweeperApp**

- Creates GridPane of buttons.
- Maps each button to a Cell.
- Handles left-click (reveal).
- Handles right-click (flag).
- Refreshes UI based on model state.
- Displays win/loss messages.

## Core Algorithms

### Mine Placement

- Randomly assign mines without duplication.

### Adjacency Calculation

- For each non-mine cell, count neighboring mines.

### Recursive Reveal (Flood Fill)

If a revealed cell has 0 adjacent mines:

- Reveal all adjacent cells.
- Recursively reveal neighbors until non-zero boundary is reached.

## Game Features

Minimum Requirements:

- 9x9 board
- 10 mines
- Left-click to reveal
- Right-click to flag
- Game over on mine reveal
- Win detection when all non-mine cells revealed

## Enhancements

- Difficulty levels (Easy, Medium, Hard)
- Custom board size
- First-click safety guarantee
- Timer
- Mine counter
- Restart button
- Persistent high scores
- CSS styling
- Sound effects

## Key Technical Challenges

### Separation of Concerns

Game logic must not be embedded inside JavaFX event handlers.

### Recursive Reveal Safety

Prevent infinite recursion by:

- Checking boundaries
- Skipping revealed cells
- Skipping flagged cells

### UI Synchronization

Ensure button states reflect model state accurately after each action.

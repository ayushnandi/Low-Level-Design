# TicTacToe Game

## Overview

Welcome to the TicTacToe project! This implementation showcases a classic game of TicTacToe in Java, designed with a focus on Low-Level Design (LLD) principles. The project demonstrates core programming concepts including game logic, user input handling, and board management.

## Project Details

### Features
- Two-player gameplay with alternating turns.
- Input validation to ensure moves are within the board and on empty cells.
- Detection of win conditions across rows, columns, and diagonals.
- Draw detection when the board is full with no winner.

### Implementation

This project is structured to reflect clear LLD principles, focusing on:
1. **Separation of Concerns:** Different methods handle specific tasks, such as `printBoard()` for displaying the board and `Win()` for checking win conditions.
2. **Encapsulation:** The game logic and board state are encapsulated within the `TicTacToe` class, ensuring that data and methods are organized.
3. **Modularity:** Methods are designed to be modular, enabling easy extension and maintenance of the game logic.

#### Main Components

- **`TicTacToe` Class:** Contains the game logic, board representation, and player turn management.
  - **`main(String[] args)`**: Entry point of the program, initiating the game.
  - **`startGame()`**: Manages game flow, including player turns and input handling.
  - **`Win(int[][] board, int row, int col, int n)`**: Determines if the current move results in a win.
  - **`printBoard()`**: Outputs the current state of the game board to the console.

### Code Walkthrough

- **Game Initialization:**
  - A 3x3 integer array represents the game board.
  - The `turn` boolean variable indicates the current player (true for Player 1, false for Player 2).

- **Player Moves:**
  - The `startGame()` method prompts players to enter their move.
  - Moves are validated for correctness and applied to the board if valid.
  - The board is printed after each move to reflect the current state.

- **Win and Draw Detection:**
  - The `Win()` method checks for win conditions by examining rows, columns, and diagonals.
  - The game ends when a player wins or all cells are filled, resulting in a draw.

## Low-Level Design (LLD) Considerations

- **Encapsulation:** The board and game state are encapsulated within the `TicTacToe` class, maintaining a clean separation between game logic and user interaction.
- **Modularity:** Methods like `Win()` and `printBoard()` are designed to handle specific tasks, making the code more manageable and easier to understand.
- **Scalability:** The current design allows for easy modifications, such as extending the game to support different board sizes or adding new features.

## Interview Questions

1. **Explain the design of the TicTacToe game in terms of LLD principles.**
   - Focus on how the class and methods are organized to handle different aspects of the game while keeping concerns separated.

2. **How does the `Win()` method determine if a player has won?**
   - Discuss the checks performed for rows, columns, and diagonals, and how the method returns a boolean value indicating a win condition.

3. **What improvements can be made to enhance the current implementation?**
   - Consider discussing potential enhancements such as error handling, user interface improvements, or advanced algorithms for game AI.

## Getting Started

1. Clone the repository: `git clone <repository-url>`
2. Navigate to the project directory: `cd TicTacToe`
3. Compile the code: `javac TicTacToe.java`
4. Run the program: `java TicTacToe`


---

if you like the read do follow me on [Linkedin](https://www.linkedin.com/in/ayush-nandi-583231230/)

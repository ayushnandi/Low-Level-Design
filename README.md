
# Low-Level Design (LLD) in Java

Welcome to the Low-Level Design (LLD) repository! This repository is a comprehensive collection of Java-based projects that demonstrate key LLD principles and design patterns through practical examples. Each concept is accompanied by a flow diagram to help visualize the design process and structure.

## Table of Contents

- [Introduction](#introduction)
- [Concepts Covered](#concepts-covered)
- [Design Patterns Implemented](#design-patterns-implemented)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This repository aims to provide a hands-on approach to understanding and applying Low-Level Design principles in software development. By working through these examples, you'll gain a deeper understanding of how to design scalable, maintainable, and efficient software systems.

## Concepts Covered

The repository covers a wide range of LLD concepts, including but not limited to:

- **SOLID Principles**: A set of five design principles intended to make software designs more understandable, flexible, and maintainable.
- **Design Patterns**: Reusable solutions to common problems in software design. These patterns help improve code readability and flexibility.

## Design Patterns Implemented

### 1. SOLID Principles
- **Single Responsibility Principle**
- **Open/Closed Principle**
- **Liskov Substitution Principle**
- **Interface Segregation Principle**
- **Dependency Inversion Principle**

### 2. Abstract Factory Design Pattern
- **Example**: Creating related objects, such as different types of cars, without specifying their concrete classes.

### 3. Decorator Design Pattern
- **Example**: A base pizza class with dynamic addition of toppings, allowing for flexible and extendable code.

### 4. Factory Design Pattern
- **Example**: Luxury Car and Average Car factory, demonstrating how to create objects without exposing the instantiation logic to the client.

### 5. Observer Design Pattern
- **Example**: Weather notification system where observers (users) are notified of updates, ensuring decoupled communication between objects.

### 6. Strategy Design Pattern
- **Example**: Tic-Tac-Toe game strategy, showcasing how to define a family of algorithms, encapsulate each one, and make them interchangeable.

## Project Structure

The repository is organized into folders, each representing a specific LLD concept or design pattern:

```plaintext
LLD-java/
│
├── AbstractFactoryPattern/
│
├── DecoratorDesignPattern/
│
├── FactoryPatternDesign/
│
├── ObserverDesignPattern/
│
├── SOLID/
│
├── StrategyDesignPattern/
│
└── TicTacToe/

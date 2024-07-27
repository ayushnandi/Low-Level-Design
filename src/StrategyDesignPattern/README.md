# Strategy Design Pattern in Java

## What is the Strategy Design Pattern?

The Strategy Design Pattern is a behavioral design pattern that allows defining a family of algorithms, encapsulating each one of them, and making them interchangeable. This pattern lets the algorithm vary independently from the clients that use it. It promotes the use of composition over inheritance, providing a flexible and reusable solution to a common problem.

## Why Use the Strategy Design Pattern?

The Strategy Design Pattern is used to:

- **Eliminate Conditional Statements:** Avoid extensive conditional statements by encapsulating each algorithm within a strategy class.
- **Promote Code Reusability:** Separate concerns by encapsulating behaviors, leading to more modular and maintainable code.
- **Enable Dynamic Behavior Change:** Change the algorithm at runtime without altering the context object that uses the algorithm.
- **Simplify Testing:** Isolate algorithms in their own classes, making it easier to test them independently.

## Examples of Strategy Design Pattern

### Example 1: Sorting Algorithms

In this example, different sorting algorithms are encapsulated in separate strategy classes.

```java
// Strategy Interface
interface SortStrategy {
    void sort(int[] array);
}

// Concrete Strategy: Bubble Sort
class BubbleSort implements SortStrategy {
    @Override
    public void sort(int[] array) {
        // Implementation of Bubble Sort
    }
}

// Concrete Strategy: Quick Sort
class QuickSort implements SortStrategy {
    @Override
    public void sort(int[] array) {
        // Implementation of Quick Sort
    }
}

// Context
class Sorter {
    private SortStrategy strategy;

    public Sorter(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortArray(int[] array) {
        strategy.sort(array);
    }
}

// Client Code
public class StrategyPatternDemo {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};

        Sorter sorter = new Sorter(new BubbleSort());
        sorter.sortArray(array);

        sorter.setStrategy(new QuickSort());
        sorter.sortArray(array);
    }
}
```

## Conclusion

The Strategy Design Pattern is a powerful tool for managing algorithms and behaviors in an object-oriented way. By using this pattern, you can create flexible, reusable, and maintainable code.

If you enjoyed this read, do follow me on [LinkedIn](https://www.linkedin.com/in/ayush-nandi-583231230/).

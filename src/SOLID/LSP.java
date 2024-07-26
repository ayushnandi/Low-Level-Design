package SOLID;

class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }
}

class Sparrow extends Bird {
    // Inherits fly() method from Bird
}

class Penguin extends Bird {
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly");
    }
}

public class LSP {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird penguin = new Penguin();

        sparrow.fly();  // This works fine
        penguin.fly();  // This will throw an exception
    }
}


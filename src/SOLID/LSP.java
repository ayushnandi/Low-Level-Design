package SOLID;

class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }
    public void twoWings() {
    	System.out.println("Have two wings");
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

        sparrow.fly(); 
        sparrow.twoWings();
        penguin.twoWings();
        penguin.fly();  // This will throw an exception
    }
}


// In Order to avoid error, the parent class should only inherit generic properties 
// in this case twoWings will not cause any error in the system but fly can



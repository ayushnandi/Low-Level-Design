package SOLID;

interface Worker {
    void work();
    void eat();
}

class HumanWorker implements Worker {
    public void work() {
        System.out.println("Human is  working");
    }

    public void eat() {
        System.out.println("Human is eating ");
    }
}

class RobotWorker implements Worker {
    public void work() {
        System.out.println("Robot is  working");
    }

    public void eat() {
        throw new UnsupportedOperationException("Robot doesn't eat");
    }
}

public class ISP {
    public static void main(String[] args) {
        Worker human =new HumanWorker();
        Worker robot = new RobotWorker();

        human.work();
        human.eat();
        robot.work();
        robot.eat();  // This will throw an exception
    }
}

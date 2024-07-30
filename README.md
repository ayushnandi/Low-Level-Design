# Factory Pattern

The Factory Pattern is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created. This pattern promotes loose coupling by eliminating the need to bind application-specific classes into the code. The client code works with interfaces and abstract classes, making it more flexible and extensible.

### Why Use the Factory Pattern?

1. **Encapsulation**: It hides the instantiation logic from the client, encapsulating the object creation code.
2. **Flexibility**: The code is more flexible and easier to extend. New object types can be introduced without changing the existing code.
3. **Decoupling**: It reduces the dependencies between the client and the created objects, promoting a clean separation of concerns.
4. **Simplifies Maintenance**: By centralizing the object creation logic, it makes the system easier to manage and maintain.

### Real-Time Use

The Factory Pattern is commonly used in scenarios where the exact type of object to be created isn't known until runtime. Some examples include:

- **Database Connections**: Creating different types of database connections based on configuration.
- **Logging**: Creating different types of loggers (e.g., file, console, network).
- **User Interface Components**: Creating different UI components based on user interactions or configuration.

### Implementation Example in Java

#### Scenario: Creating Different Types of Notifications (Email and SMS)

**Step 1: Define the Notification Interface**

```java
public interface Notification {
    void notifyUser();
}
```

**Step 2: Implement Concrete Classes**

```java
public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an Email Notification");
    }
}

public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS Notification");
    }
}
```

**Step 3: Create the Factory Class**

```java
public class NotificationFactory {
    public Notification createNotification(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        switch (type) {
            case "EMAIL":
                return new EmailNotification();
            case "SMS":
                return new SMSNotification();
            default:
                throw new IllegalArgumentException("Unknown notification type " + type);
        }
    }
}
```

**Step 4: Use the Factory**

```java
public class FactoryPatternDemo {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        Notification emailNotification = factory.createNotification("EMAIL");
        emailNotification.notifyUser();

        Notification smsNotification = factory.createNotification("SMS");
        smsNotification.notifyUser();
    }
}
```

### Diagram

```plaintext
  +-------------------+
  | Notification      |
  +-------------------+
  | + notifyUser()    |
  +-------------------+
         ^
         |
  +-------------------+      +-------------------+
  | EmailNotification |      | SMSNotification   |
  +-------------------+      +-------------------+
  | + notifyUser()    |      | + notifyUser()    |
  +-------------------+      +-------------------+

  +---------------------+
  | NotificationFactory |
  +---------------------+--------------------+
  | + createNotification(type): Notification |
  +-------------------+----------------------+
         |
         v
  +-------------------------+
  | FactoryPatternDemo      |
  +-------------------------+
  | + main()                |
  +-------------------------+
```

This diagram and example illustrate how the Factory Pattern can be used to create different types of notifications. The `NotificationFactory` class encapsulates the creation logic, and the client (`FactoryPatternDemo`) uses the factory to get the required notification objects without knowing the concrete classes involved.


If you enjoyed this read, do follow me on [LinkedIn](https://www.linkedin.com/in/ayush-nandi-583231230/).

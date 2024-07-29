# Observable (Observer) Design Pattern

## What is the Observer Design Pattern?

The Observer Design Pattern is a behavioral design pattern where an object, known as the subject, maintains a list of its dependents, known as observers, and notifies them of any state changes, usually by calling one of their methods. This pattern is mainly used to implement distributed event-handling systems.

## Why Use the Observer Design Pattern?

The Observer Design Pattern is used to:

- **Promote Loose Coupling:** Reduce dependencies between the subject and the observers.
- **Implement Event Handling:** Enable event-driven programming by notifying observers of state changes.
- **Allow Dynamic Subscription:** Add or remove observers at runtime.

## Examples of Observer Design Pattern

### Example: Weather Station

#### Diagram
![image](https://github.com/user-attachments/assets/26558257-a525-469f-b992-566918e63e0b)


#### Code

```java
import java.util.ArrayList;
import java.util.List;

// Observer Interface
interface Observer {
    void update(float temperature, float humidity, float pressure);
}

// Concrete Observer: Display Device
class DisplayDevice implements Observer {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Display Device: " + temperature + "C degrees and " + humidity + "% humidity.");
    }
}

// Concrete Observer: Logger Device
class LoggerDevice implements Observer {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Logger Device: Recording data -> Temperature: " + temperature + ", Humidity: " + humidity + ", Pressure: " + pressure);
    }
}

// Subject Interface
interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

// Concrete Subject: Weather Station
class WeatherStation implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}

// Client Code
public class ObserverPatternExample {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer displayDevice = new DisplayDevice();
        Observer loggerDevice = new LoggerDevice();

        weatherStation.addObserver(displayDevice);
        weatherStation.addObserver(loggerDevice);

        weatherStation.setMeasurements(25.0f, 65.0f, 1013.0f);
        weatherStation.setMeasurements(28.0f, 70.0f, 1012.0f);
    }
}
```

If you enjoyed this read, do follow me on [LinkedIn](https://www.linkedin.com/in/ayush-nandi-583231230/).

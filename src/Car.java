public class Car {
    String make = "Chevrolet";
    String model;
    int year = 2020;
    String color = "Blue";
    double price = 50000.00;

    String name;

    // constructors, can have multiple if different parameters
    Car() {
    }

    Car(String name) {
        this.name = name;
    }

    Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // copy constructor
    Car(Car x) {
        this.copy(x);
    }

    void drive() {
        System.out.println("You drive the car");
    }
    void brake() {
        System.out.println("You brake the car");
    }

    // overriding toString built-in method
    public String toString() {
        return make + "\n" + model + "\n" + color + "\n" + year;
    }

    // getters
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }

    // setters
    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }

    // copy method
    public void copy(Car x) {
        this.setMake(x.getMake());
        this.setModel(x.getModel());
    }
}

class Car {
    // Instance variables
    String model;
    int year;
    String color;

    // Parameterized constructor
    public Car(String model, int year, String color) {
        this.model = model;  // Initializing the 'model' with the argument passed to the constructor
        this.year = year;    // Initializing the 'year' with the argument passed to the constructor
        this.color = color;  // Initializing the 'color' with the argument passed to the constructor
    }

    // Method to display the values of the Car object
    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println("Car Color: " + color);
    }
}

public class ParameterizedConstructorExample {
    public static void main(String[] args) {
        // Creating objects using the parameterized constructor
        Car car1 = new Car("Tesla Model S", 2023, "Red");
        Car car2 = new Car("BMW 5 Series", 2021, "Black");

        // Displaying the details of the cars
        System.out.println("Details of Car 1:");
        car1.displayDetails();

        System.out.println("\nDetails of Car 2:");
        car2.displayDetails();
    }
}
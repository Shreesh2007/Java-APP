public class Car {
    String modelName;
    double price;

    // Constructor 1: Without details
    Car() {
        modelName = "Not Available";
        price = 0;
    }

    // Constructor 2: Only model name
    Car(String model) {
        modelName = model;
        price = 0;
    }

    // Constructor 3: Model name and price
    Car(String model, double cost) {
        modelName = model;
        price = cost;
    }

    public static void main(String[] args) {
        // Creating Objects using different constructors
        Car car1 = new Car();
        Car car2 = new Car("BMW");
        Car car3 = new Car("Audi", 7500000);

        // Displaying Car Details
        System.out.println("Car 1 Details:");
        System.out.println("Car Model : " + car1.modelName);
        System.out.println("Car Price : " + car1.price);
        System.out.println();

        System.out.println("Car 2 Details:");
        System.out.println("Car Model : " + car2.modelName);
        System.out.println("Car Price : " + car2.price);
        System.out.println();

        System.out.println("Car 3 Details:");
        System.out.println("Car Model : " + car3.modelName);
        System.out.println("Car Price : " + car3.price);
        System.out.println();
    }
}
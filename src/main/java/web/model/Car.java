package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String brand;
    private String model;
    private String countryOfOrigin;

    public Car() {
    }

    public Car(String brand, String model, String countryOfOrigin) {
        this.brand = brand;
        this.model = model;
        this.countryOfOrigin = countryOfOrigin;
    }

    public static List<Car> cars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "X1", "Germany"));
        cars.add(new Car("Audi", "A4", "Germany"));
        cars.add(new Car("Toyota", "Prius", "Japan"));
        cars.add(new Car("Kia", "Sportage", "South Korea"));
        cars.add(new Car("Volvo", "XC90", "Sweden"));
        return cars;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                '}';
    }
}

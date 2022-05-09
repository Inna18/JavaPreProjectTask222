package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> returnCars(int count) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "X1", "Germany"));
        cars.add(new Car("Audi", "A4", "Germany"));
        cars.add(new Car("Toyota", "Prius", "Japan"));
        cars.add(new Car("Kia", "Sportage", "South Korea"));
        cars.add(new Car("Volvo", "XC90", "Sweden"));

        return cars.stream().limit(count).collect(Collectors.toList());
    }
}

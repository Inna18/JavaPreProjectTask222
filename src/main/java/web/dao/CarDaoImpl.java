package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> returnCars(int count) {

        List<Car> carsList = new ArrayList<>();
        List<Car> carsList2 = Car.cars();

        if (count == 1) {
            carsList.add(carsList2.get(0));
            return carsList;
        } else if (count == 2) {
            carsList.add(carsList2.get(0));
            carsList.add(carsList2.get(1));
            return carsList;
        } else if (count == 3) {
            carsList.add(carsList2.get(0));
            carsList.add(carsList2.get(1));
            carsList.add(carsList2.get(2));
            return carsList;
        } else if (count == 4) {
            carsList.add(carsList2.get(0));
            carsList.add(carsList2.get(1));
            carsList.add(carsList2.get(2));
            carsList.add(carsList2.get(3));
            return carsList;
        } else if (count >= 5 || count == 0) {
            carsList = carsList2;
            return carsList;
        } else {
            return null;
        }
    }
}

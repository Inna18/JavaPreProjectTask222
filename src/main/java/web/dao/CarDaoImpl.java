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

        if (count == 0 || count >= 5) {
            carsList = carsList2;
        } else {
            for (int i = 0; i < count; i++) {
                carsList.add(carsList2.get(i));
            }
        }
        return carsList;
    }
}

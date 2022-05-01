package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    @GetMapping("")
    public String getCars(@RequestParam(value = "count", required = false, defaultValue = "5") int count, Model model) {
        CarService carService = new CarServiceImpl();
        List<Car> cars = carService.returnCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }

}

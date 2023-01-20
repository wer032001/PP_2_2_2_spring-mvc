package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "BMW", "Red"));
        cars.add(new Car(2, "LADA", "Black"));
        cars.add(new Car(3, "HONDA", "Green"));
        cars.add(new Car(4, "OPEL", "White"));
        cars.add(new Car(5, "VOLGA", "Gray"));
        return cars;
    }
}

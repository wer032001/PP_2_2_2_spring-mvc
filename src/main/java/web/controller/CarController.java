package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.util.stream.Collectors;

@Controller
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }
    @GetMapping("/cars")
    public String showCars(@RequestParam(required = false, name = "count") Integer s, Model model) {
        if (s == null) {
            model.addAttribute("cars", carService.getCars());
        } else {
            model.addAttribute("cars", carService.getCars().stream()
                    .limit(s)
                    .collect(Collectors.toList()));
        }
        return "cars";
    }
}

package pl.slimcode.springdockerbasics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @GetMapping("/car")
    public String getAllCars() {
        return "{\"manufacturer\":\"Audi\",\"model\":\"A5\"}";
    }
}

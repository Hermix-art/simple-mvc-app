package pl.her.springcourse.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Herman Kulik
 */
@Controller
public class SimpleController {

    @GetMapping("/city") // ourApplicationName/city
    public String showCity() {
        return "first/city";
    }

    @GetMapping("/country")
    public String showCountry() {
        return "first/country";
    }
}

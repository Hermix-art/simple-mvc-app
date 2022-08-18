package pl.her.springcourse.config.controllers;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Herman Kulik
 */
@Controller
@RequestMapping("escape/")
public class SecondController {

    @GetMapping("/exit")
    public String exit(@RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "surname", required = false) String surname) {
        System.out.println("Name is " + name + " " + surname);
        return "second/exit";
    }

    @GetMapping("/exitAgain")
    public String exitAgain(HttpServletRequest request) {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        System.out.println("Name is " + name + " " + surname);
        return "second/exit";
    }

}

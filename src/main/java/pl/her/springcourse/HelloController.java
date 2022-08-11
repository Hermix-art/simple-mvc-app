package pl.her.springcourse;

import java.lang.reflect.Method;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

  @GetMapping("/hello-man")
//  @RequestMapping(value = "/hello-man", method = RequestMethod.GET)
  public String hello() {
    return "hello-man"; //name of view
  }

}

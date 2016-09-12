package fr.jcottet;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tettoc on 12/09/2016.
 */
@RestController
public class Controller {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}

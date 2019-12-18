package tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author mabel.iglesiasham
 * @since 16.8.0
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        System.out.println("The home page was called");
        return "home";
    }
}

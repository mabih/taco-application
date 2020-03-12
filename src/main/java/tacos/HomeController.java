package tacos;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author mabel.iglesiasham
 * @since 16.8.0
 */

@Slf4j
@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        System.out.println("The home page was called");
        return "home";
    }

    @PostMapping
    public String processOrder(){
        log.info("Moved to design a Taco");
        return "redirect:/design";
    }
}

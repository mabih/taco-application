package tacos.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tacos.Ingredient;
import tacos.Taco;

import javax.validation.Valid;
import java.beans.DesignMode;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static tacos.Ingredient.*;

/**
 * @author mabel.iglesiasham
 * @since 16.8.0
 */

@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacoController {

    @GetMapping
    public String showDesignForm(Model model){
        List<Ingredient> ingredients = Arrays.asList(
                new Ingredient("FLTO", "Flour Tortilla", Type.WRAP),
                new Ingredient("COTO", "Corn Tortilla", Type.WRAP),
                new Ingredient("GRBF", "Ground Beef", Type.PROTEIN),
                new Ingredient("CARN", "Carnitas", Type.PROTEIN),
                new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES),
                new Ingredient("LETC", "Lettuce", Type.VEGGIES),
                new Ingredient("CHED", "Cheddar", Type.CHEESE),
                new Ingredient("JACK", "Monterrey Jack", Type.CHEESE),
                new Ingredient("SLSA", "Salsa", Type.SAUCE),
                new Ingredient("SRCR","Sour Cream", Type.SAUCE)
        );

        Type[] types = Ingredient.Type.values();
        for(Type type : types){
            model.addAttribute(type.toString().toLowerCase(),
                     ingredients
                             .stream()
                             .filter(ingredient -> ingredient.getType().equals(type))
                             .collect(Collectors.toList())
            );
        }
        model.addAttribute("taco", new Taco());//if called design then when error comes the page doesnt load properly
        System.out.println("The design page was called");
        return "design";
    }

    @PostMapping
    public String processDesign(@Valid Taco taco, Errors errors)
    {
        if(errors.hasErrors()){
            return "design";
        }
       //save the Taco design..
        log.info("Processing design: "+ taco);

        return "redirect:/orders/current";
    }
}

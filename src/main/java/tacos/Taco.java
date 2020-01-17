package tacos;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * @author mabel.iglesiasham
 * @since 16.8.0
 */

@Data
public class Taco {

    @NotNull
    @Size(min=5, message = "Name must be at least 5 characters long")
    private String name;

    @NotNull(message = "You must choose at least one ingredient")
    @Size(min=1, message = "You must choose at least one ingredient")
    private List<String> ingredients;
}

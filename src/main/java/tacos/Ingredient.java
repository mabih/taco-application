package tacos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @author mabel.iglesiasham
 * @since 16.8.0
 */

@Data
@RequiredArgsConstructor
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;

    public enum Type{
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

}

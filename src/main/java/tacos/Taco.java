package tacos;

import lombok.Data;

import java.util.List;

/**
 * @author mabel.iglesiasham
 * @since 16.8.0
 */

@Data
public class Taco {

    private String name;
    private List<String> ingredients;
}

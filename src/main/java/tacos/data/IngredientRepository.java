package tacos.data;

//import org.springframework.data.repository.CrudRepository;
import tacos.Ingredient;

/**
 * @author mabel.iglesiasham
 * @since 16.8.0
 */
public interface IngredientRepository /*extends CrudRepository<Ingredient, String>*/ { //<Entity type of repository, id type>

    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient save(Ingredient ingredient);
}

package tacos.data;

import tacos.Ingredient;

/**
 * @author mabel.iglesiasham
 * @since 16.8.0
 */
public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient save(Ingredient ingredient);
}

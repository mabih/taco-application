package tacos.data;

import tacos.Taco;

/**
 * @author mabel.iglesiasham
 * @since 16.8.0
 */
public interface TacoRepository {

    Taco save(Taco design);
}

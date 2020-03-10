package tacos.data;

//import org.springframework.data.repository.CrudRepository;
import tacos.Taco;

/**
 * @author mabel.iglesiasham
 * @since 16.8.0
 */
public interface TacoRepository /*extends CrudRepository<Taco, Long>*/ {

    Taco save(Taco design);
}

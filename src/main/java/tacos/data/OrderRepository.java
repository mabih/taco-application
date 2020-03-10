package tacos.data;

//import org.springframework.data.repository.CrudRepository;
import tacos.Order;

/**
 * @author mabel.iglesiasham
 * @since 16.8.0
 */
public interface OrderRepository /*extends CrudRepository<Order, Long>*/ {

    Order save(Order order);
}

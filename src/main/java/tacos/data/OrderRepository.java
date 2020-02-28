package tacos.data;

import tacos.Order;

/**
 * @author mabel.iglesiasham
 * @since 16.8.0
 */
public interface OrderRepository {

    Order save(Order order);
}

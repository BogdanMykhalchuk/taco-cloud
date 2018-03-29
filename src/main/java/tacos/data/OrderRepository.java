package tacos.data;

import tacos.Order;

/**
 * Created by Dreawalker on 21.03.2018.
 */
public interface OrderRepository {
    Iterable<Order> findAll();

    Order findOne(String id);

    Order save(Order ingredient);
}

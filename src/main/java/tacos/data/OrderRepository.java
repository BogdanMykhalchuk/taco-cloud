package tacos.data;

import org.springframework.data.domain.Pageable;
import tacos.Order;
import tacos.User;

import java.util.List;

/**
 * Created by Dreawalker on 21.03.2018.
 */
public interface OrderRepository {
    Iterable<Order> findAll();

    Order findOne(String id);

    Order save(Order ingredient);

    List<Order> findByUserOrderByPlacedAtDesc(User user, Pageable pagable);
}

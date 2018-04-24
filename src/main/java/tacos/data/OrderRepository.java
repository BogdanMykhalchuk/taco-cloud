package tacos.data;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import tacos.Order;
import tacos.User;

/**
 * Created by Dreawalker on 21.03.2018.
 */

public interface OrderRepository extends JpaRepository<Order, Long> {
    Page<Order> findByUserOrderByPlacedAtDesc(User user, Pageable pageable);
}

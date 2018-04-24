package tacos.data;

import org.springframework.data.jpa.repository.JpaRepository;
import tacos.User;

/**
 * Created by Dreawalker on 31.03.2018.
 */

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

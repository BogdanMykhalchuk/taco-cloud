package tacos.data;

import org.springframework.data.repository.CrudRepository;
import tacos.User;

/**
 * Created by Dreawalker on 31.03.2018.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}

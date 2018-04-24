package tacos.data;

import org.springframework.data.jpa.repository.JpaRepository;
import tacos.Taco;

/**
 * Created by Dreawalker on 22.04.2018.
 */
public interface TacoRepository extends JpaRepository<Taco, Long> {

}

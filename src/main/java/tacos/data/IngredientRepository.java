package tacos.data;

import org.springframework.data.jpa.repository.JpaRepository;
import tacos.Ingredient;

/**
 * Created by Dreawalker on 21.03.2018.
 */

public interface IngredientRepository
        extends JpaRepository<Ingredient, String> {
}

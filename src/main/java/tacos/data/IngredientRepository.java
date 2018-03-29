package tacos.data;

import org.springframework.data.repository.CrudRepository;
import tacos.Ingredient;

/**
 * Created by Dreawalker on 21.03.2018.
 */
public interface IngredientRepository
        extends CrudRepository<Ingredient, String> {
}

package tacos.web.api;

import lombok.Getter;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.core.Relation;
import tacos.Ingredient;
import tacos.Type;

/**
 * Created by Dreawalker on 22.04.2018.
 */
@Relation(value="ingredient", collectionRelation="ingredients")
public class IngredientResource extends ResourceSupport {
    @Getter
    private String name;
    @Getter
    private Type type;
    public IngredientResource(Ingredient ingredient) {
        this.name = ingredient.getName();
        this.type = ingredient.getType();
    }
}

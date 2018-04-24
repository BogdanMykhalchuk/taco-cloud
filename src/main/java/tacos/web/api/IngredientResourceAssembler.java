package tacos.web.api;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import tacos.Ingredient;
import tacos.web.IngredientController;

/**
 * Created by Dreawalker on 22.04.2018.
 */
class IngredientResourceAssembler extends
        ResourceAssemblerSupport<Ingredient, IngredientResource> {
    public IngredientResourceAssembler() {
        super(IngredientController.class, IngredientResource.class);
    }
    @Override
    public IngredientResource toResource(Ingredient ingredient) {
        return createResourceWithId(ingredient.getId(), ingredient);
    }
    @Override
    protected IngredientResource instantiateResource(
            Ingredient ingredient) {
        return new IngredientResource(ingredient);
    }
}
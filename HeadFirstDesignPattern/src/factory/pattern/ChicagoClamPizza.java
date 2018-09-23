package factory.pattern;

/**
 *
 * @author wangchao
 */
public class ChicagoClamPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public ChicagoClamPizza() {
    }
    
    public ChicagoClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        this.dough = this.ingredientFactory.createDough();
        this.sauce = this.ingredientFactory.createSauce();
    }
}

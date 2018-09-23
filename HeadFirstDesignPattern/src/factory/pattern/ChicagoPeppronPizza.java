package factory.pattern;

/**
 *
 * @author wangchao
 */
public class ChicagoPeppronPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public ChicagoPeppronPizza() {
    }
    
    public ChicagoPeppronPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        this.dough = this.ingredientFactory.createDough();
        this.sauce = this.ingredientFactory.createSauce();
    }
}

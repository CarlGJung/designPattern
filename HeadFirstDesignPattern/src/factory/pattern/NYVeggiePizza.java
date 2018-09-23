package factory.pattern;

/**
 *
 * @author wangchao
 */
public class NYVeggiePizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public NYVeggiePizza() {
    }
    
    public NYVeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        this.dough = this.ingredientFactory.createDough();
        this.sauce = this.ingredientFactory.createSauce();
    }
}

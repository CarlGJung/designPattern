package factory.pattern;

/**
 *
 * @author wangchao
 */
public class NYClamPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public NYClamPizza() {
    }
    
    public NYClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        this.dough = this.ingredientFactory.createDough();
        this.sauce = this.ingredientFactory.createSauce();
    }
}

package factory.pattern;

/**
 *
 * @author wangchao
 */
public class NYPeppronPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public NYPeppronPizza() {
    }
    
    public NYPeppronPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        this.dough = this.ingredientFactory.createDough();
        this.sauce = this.ingredientFactory.createSauce();
    }
}

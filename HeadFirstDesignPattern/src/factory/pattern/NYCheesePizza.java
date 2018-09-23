package factory.pattern;

/**
 *
 * @author wangchao
 */
public class NYCheesePizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public NYCheesePizza() {
    }
    
    public NYCheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        this.dough = this.ingredientFactory.createDough();
        this.sauce = this.ingredientFactory.createSauce();
    }
}

package factory.pattern;

/**
 *
 * @author wangchao
 */
public class ChicagoCheesePizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public ChicagoCheesePizza() {
    }
    
    public ChicagoCheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        this.dough = this.ingredientFactory.createDough();
        this.sauce = this.ingredientFactory.createSauce();
    }
    
}

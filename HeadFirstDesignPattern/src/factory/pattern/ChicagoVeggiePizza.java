package factory.pattern;

/**
 *
 * @author wangchao
 */
public class ChicagoVeggiePizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public ChicagoVeggiePizza() {
    }
    
    public ChicagoVeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        this.dough = this.ingredientFactory.createDough();
        this.sauce = this.ingredientFactory.createSauce();
    }
}

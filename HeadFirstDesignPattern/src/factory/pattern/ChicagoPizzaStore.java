package factory.pattern;

/**
 *
 * @author wangchao
 */
public class ChicagoPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory factory = new ChicagoPizzaIngredientFactory();
        
        if (type.equals("cheese")) {
            pizza = new ChicagoCheesePizza(factory);
        } else if (type.equals("peppron")) {
            pizza = new ChicagoPeppronPizza(factory);
        } else if (type.equals("clam")) {
            pizza = new ChicagoClamPizza(factory);
        } else if (type.equals("veggie")) {
            pizza = new ChicagoVeggiePizza(factory);
        }
        return pizza;
    }

}

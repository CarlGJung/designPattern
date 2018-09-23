package factory.pattern;

/**
 *
 * @author wangchao
 */
public class NYPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory factory = new NYPizzaIngredientFactory();
        
        if (type.equals("cheese")) {
            pizza = new NYCheesePizza(factory);
        } else if (type.equals("peppron")) {
            pizza = new NYPeppronPizza(factory);
        } else if (type.equals("clam")) {
            pizza = new NYClamPizza(factory);
        } else if (type.equals("veggie")) {
            pizza = new NYVeggiePizza(factory);
        }
        return pizza;
    }

}

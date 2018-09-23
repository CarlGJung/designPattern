package factory.pattern;

/**
 *
 * @author wangchao
 */
public abstract class PizzaStore {
    
    public Pizza orderPizze(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    
    public abstract Pizza createPizza(String type);
}

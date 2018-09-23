package factory.nopattern;

import factory.pattern.Pizza;
import factory.pattern.ChicagoCheesePizza;
import factory.pattern.ChicagoClamPizza;
import factory.pattern.ChicagoPeppronPizza;
import factory.pattern.ChicagoVeggiePizza;
import factory.pattern.NYCheesePizza;
import factory.pattern.NYClamPizza;
import factory.pattern.NYPeppronPizza;
import factory.pattern.NYVeggiePizza;

/**
 *
 * @author wangchao
 */
public class DependentPizzaStore {
    public Pizza createPizza(String style, String type){
        Pizza pizza = null;
        
        if ("NY".equals(style)) {
            if (type.equals("cheese")) {
                pizza = new NYCheesePizza();
            } else if (type.equals("peppron")) {
                pizza = new NYPeppronPizza();
            } else if (type.equals("clam")) {
                pizza = new NYClamPizza();
            } else if (type.equals("veggie")) {
                pizza = new NYVeggiePizza();
            }
        } else if ("Chicago".equals(style)) {
            if (type.equals("cheese")) {
                pizza = new ChicagoCheesePizza();
            } else if (type.equals("peppron")) {
                pizza = new ChicagoPeppronPizza();
            } else if (type.equals("clam")) {
                pizza = new ChicagoClamPizza();
            } else if (type.equals("veggie")) {
                pizza = new ChicagoVeggiePizza();
            }
        } else {
            throw new IllegalArgumentException("Invalid type of pizza " + style);
        }
        
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}

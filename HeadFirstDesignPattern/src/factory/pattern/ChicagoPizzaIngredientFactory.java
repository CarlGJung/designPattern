package factory.pattern;

/**
 *
 * @author wangchao
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Dough createDough() {
        return new Dough(){
            @Override
            public String getName() {
                return "Chicago Dough";
            }
        };
    }

    @Override
    public Sauce createSauce() {
        return new Sauce(){
            @Override
            public String getName() {
                return "Chicago Sauce";
            }
        };
    }

}

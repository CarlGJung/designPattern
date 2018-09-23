package factory.pattern;

/**
 *
 * @author wangchao
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Dough createDough() {
        return new Dough(){
            @Override
            public String getName() {
                return "NY Dough";
            }
        };
    }

    @Override
    public Sauce createSauce() {
        return new Sauce(){
            @Override
            public String getName() {
                return "Ny Sauce";
            }
        };
    }

}

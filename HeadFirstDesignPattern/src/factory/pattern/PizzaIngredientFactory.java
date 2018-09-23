package factory.pattern;

/**
 *
 * @author wangchao
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
}

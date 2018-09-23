package factory.pattern;

/**
 *
 * @author wangchao
 */
public class PizzaTestDriver {
    public static void main(String[] args){
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        
        Pizza nyCheese = nyStore.createPizza("cheese");
        System.out.println(nyCheese.getName());
        Pizza chicagoCheese = chicagoStore.createPizza("cheese");
        System.out.println(chicagoCheese.getName());
    }
}

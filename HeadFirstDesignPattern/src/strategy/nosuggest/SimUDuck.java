package strategy.nosuggest;

/**
 *
 * @author wangchao
 */
public class SimUDuck {
    public static void main(String[] args){
        Duck mallardDuck = new MallardDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck rubberDuck = new RubberDuck();
        Duck decoyDuck = new DecoyDuck();
        
        simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(rubberDuck);
        simulate(decoyDuck);
    }
    
    public static void simulate(Duck duck){
        duck.swim();
        duck.display();
        if (duck instanceof Quackable) {
            ((Quackable)duck).quack();
        }
        if (duck instanceof Flyable) {
            Flyable.class.cast(duck).fly();
        }
    }
}

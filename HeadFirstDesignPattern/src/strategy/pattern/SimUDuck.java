package strategy.pattern;

import strategy.pattern.behavior.FlyRocketPower;


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
        
        Duck model = new ModelDuck();
        model.display();
        model.fly();
        model.setFlyBehavior(new FlyRocketPower());
        model.fly();
    }
    
    public static void simulate(Duck duck){
        duck.display();
        duck.quack();
        duck.swim();
        duck.fly();
    }
}

package strategy.pattern;

import strategy.pattern.behavior.FlyWithWings;
import strategy.pattern.behavior.Quack;

/**
 *
 * @author wangchao
 */
public class RedHeadDuck extends Duck{
    public RedHeadDuck(){
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }
    
    @Override
    public void display() {
        System.out.println("== red dead duck ==");
    }
    
}

package strategy.pattern;

import strategy.pattern.behavior.FlyNoWay;
import strategy.pattern.behavior.Squeak;

/**
 *I
 * @author wangchao
 */
public class RubberDuck extends Duck{
    public RubberDuck(){
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("== rubber duck ==");
    }

}

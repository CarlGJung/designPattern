package strategy.pattern;

import strategy.pattern.behavior.FlyNoWay;
import strategy.pattern.behavior.Quack;

/**
 *
 * @author wangchao
 */
public class ModelDuck extends Duck{
    public ModelDuck(){
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("== model duck ==");
    }
}

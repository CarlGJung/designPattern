package strategy.pattern;

import strategy.pattern.behavior.FlyNoWay;
import strategy.pattern.behavior.MuteQuack;


/**
 *
 * @author wangchao
 */
public class DecoyDuck extends Duck{
    public DecoyDuck(){
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();
    }
    
    @Override
    public void display() {
        System.out.println("== decoy duck ==");
    }

}

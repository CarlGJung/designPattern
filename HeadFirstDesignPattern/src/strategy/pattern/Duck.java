package strategy.pattern;

import strategy.pattern.behavior.QuackBehavior;
import strategy.pattern.behavior.FlyBehavior;

/**
 *
 * @author wangchao
 */
public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    
    public Duck(){
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
    
    public void quack(){
        quackBehavior.quack();
    }
    public void swim(){
        System.out.println(this.getClass().getSimpleName() + " swim");
    }
    public void fly(){
        flyBehavior.fly();
    }
    public abstract void display();
}

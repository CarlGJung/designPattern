package strategy.nosuggest;

/**
 *
 * @author wangchao
 */
public class RedHeadDuck extends Duck implements Flyable, Quackable{

    @Override
    public void display() {
        System.out.println("red dead duck");
    }

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " fly");
    }

    @Override
    public void quack() {
        System.out.println(this.getClass().getSimpleName() + " quack");
    }
    
}

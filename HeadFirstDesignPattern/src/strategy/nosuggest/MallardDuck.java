package strategy.nosuggest;

/**
 *
 * @author wangchao
 */
public class MallardDuck extends Duck implements Flyable, Quackable{

    @Override
    public void display() {
        System.out.println("mallard duck");
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

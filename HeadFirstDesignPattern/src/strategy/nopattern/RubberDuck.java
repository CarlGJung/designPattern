package strategy.nopattern;

/**
 *
 * @author wangchao
 */
public class RubberDuck extends Duck{
    
    @Override
    public void quack(){
        System.out.println(this.getClass().getSimpleName() + " squeak");
    }
    @Override
    public void fly(){
    }
    @Override
    public void display() {
        System.out.println("rubber duck");
    }

}

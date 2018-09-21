package strategy.nosuggest;

/**
 *
 * @author wangchao
 */
public class RubberDuck extends Duck implements Quackable{
    
    @Override
    public void quack(){
        System.out.println(this.getClass().getSimpleName() + " squeak");
    }

    @Override
    public void display() {
        System.out.println("rubber duck");
    }

}

package strategy.nopattern;

/**
 *
 * @author wangchao
 */
public class DecoyDuck extends Duck{
    @Override
    public void quack(){
    }
    @Override
    public void fly(){
    }
    
    @Override
    public void display() {
        System.out.println("decoy duck");
    }

}

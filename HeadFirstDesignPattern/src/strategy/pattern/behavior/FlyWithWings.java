package strategy.pattern.behavior;

/**
 *
 * @author wangchao
 */
public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("fly with wings");
    }
    
}

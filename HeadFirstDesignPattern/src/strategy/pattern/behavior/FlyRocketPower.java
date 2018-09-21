package strategy.pattern.behavior;

/**
 *
 * @author wangchao
 */
public class FlyRocketPower implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("fly with rocket");
    }

}

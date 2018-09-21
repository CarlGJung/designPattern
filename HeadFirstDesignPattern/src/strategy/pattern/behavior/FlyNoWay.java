package strategy.pattern.behavior;

/**
 *
 * @author wangchao
 */
public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("can not fly");
    }

}

package strategy.pattern.behavior;

/**
 *
 * @author wangchao
 */
public class Squeak implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("squeak");
    }

}

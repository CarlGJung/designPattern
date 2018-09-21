package strategy.pattern.behavior;

/**
 *
 * @author wangchao
 */
public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("quack");
    }

}

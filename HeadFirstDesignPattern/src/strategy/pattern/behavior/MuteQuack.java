package strategy.pattern.behavior;

/**
 *
 * @author wangchao
 */
public class MuteQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("silence");
    }

}

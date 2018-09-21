package strategy.nosuggest;

/**
 *
 * @author wangchao
 */
public abstract class Duck {
    public void swim(){
        System.out.println(this.getClass().getSimpleName() + " swim");
    }

    public abstract void display();
}

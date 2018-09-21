package strategy.nopattern;

/**
 *
 * @author wangchao
 */
public abstract class Duck {
    public void quack(){
        System.out.println(this.getClass().getSimpleName() + " quack");
    }
    public void swim(){
        System.out.println(this.getClass().getSimpleName() + " swim");
    }
    public void fly(){
        System.out.println(this.getClass().getSimpleName() + " fly");
    }
    public abstract void display();
}

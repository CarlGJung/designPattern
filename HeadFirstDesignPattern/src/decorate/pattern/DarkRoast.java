package decorate.pattern;

/**
 *
 * @author wangchao
 */
public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "DarkRoast";
    }
    
    public DarkRoast(int size){
        this();
        this.setSize(size);
    }
    @Override
    public double cost() {
        return getCostBySize(.99);
    }

}

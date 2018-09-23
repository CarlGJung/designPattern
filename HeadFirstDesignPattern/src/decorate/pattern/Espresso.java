package decorate.pattern;

/**
 *
 * @author wangchao
 */
public class Espresso extends Beverage{

    public Espresso() {
        description = "Espresso";
    }
    
    public Espresso(int size){
        this();
        this.setSize(size);
    }
    
    @Override
    public double cost() {
        return getCostBySize(1.99);
    }

}

package decorate.pattern;

/**
 *
 * @author wangchao
 */
public class HouseBlend extends Beverage{

    public HouseBlend(){
        this.description = "House Blend ";
    }
    
    public HouseBlend(int size){
        this();
        this.setSize(size);
    }
    
    @Override
    public double cost() {
        return getCostBySize(.89);
    }

}

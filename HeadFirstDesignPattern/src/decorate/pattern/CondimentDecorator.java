package decorate.pattern;

/**
 *
 * @author wangchao
 */
public abstract class CondimentDecorator extends Beverage{
    protected Beverage beverage;
    
    @Override
    public abstract String getDescription();
    
    @Override
    public int getSize(){
        return beverage.getSize();
    }
    
}

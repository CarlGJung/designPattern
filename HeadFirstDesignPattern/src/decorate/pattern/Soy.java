package decorate.pattern;

/**
 *
 * @author wangchao
 */
public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    
    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Soy ";
    }

    @Override
    public double cost() {
        return getCostBySize(.15) + this.beverage.cost();
    }

}

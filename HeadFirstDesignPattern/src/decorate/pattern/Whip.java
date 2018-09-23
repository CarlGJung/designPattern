package decorate.pattern;

/**
 *
 * @author wangchao
 */
public class Whip extends CondimentDecorator{
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    
    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Whip ";
    }

    @Override
    public double cost() {
        return getCostBySize(.10) + this.beverage.cost();
    }

}

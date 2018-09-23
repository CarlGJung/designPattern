package decorate.nopattern;

/**
 *
 * @author wangchao
 */
public class HouseBlend extends Beverage{

    public HouseBlend(){
        this.description = "House Blend ";
    }

    @Override
    public double cost() {
        double cost = 10D;
        
        if (this.hasMilk()) {
            cost += 1;
        }
        if (this.hasMocha()) {
            cost += 2;
        }
        if (this.hasSoy()) {
            cost += 3;
        }
        if (this.hasWhip()) {
            cost += 1;
        }
        return cost;
    }

}

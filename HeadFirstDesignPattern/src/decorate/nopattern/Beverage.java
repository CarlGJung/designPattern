package decorate.nopattern;

/**
 *
 * @author wangchao
 */
public abstract class Beverage {
    protected String description = "Unknown Beverage";;
    protected boolean milk;
    protected boolean soy;
    protected boolean mocha;
    protected boolean whip;
    
    public abstract double cost();
    
    public String getDescription(){
        return description;
    }

    public boolean hasMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean hasSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean hasMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean hasWhip() {
        return whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }
    
    
}

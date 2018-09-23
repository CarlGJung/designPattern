package decorate.pattern;

/**
 *
 * @author wangchao
 */
public abstract class Beverage {
    protected String description = "Unknown　Beverage";
    protected int size;
    public static final int TALL = 1;
    public static final int GRANDE = 2;
    public static final int VENTI = 3;
    
    public abstract double cost();
    
    public double getCostBySize(double cost){
        int size = this.getSize();
        return (size - 1) * 0.05 + 0.1 + cost;
    }
    
    public String getDescription(){
        return description;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
}

package factory.pattern;

/**
 *
 * @author wangchao
 */
public abstract class Pizza {
    Dough dough;
    Sauce sauce;
    
    public abstract void prepare();
    public void bake(){
    }
    public void cut(){
    }
    public void box(){
    }
    public String getName(){
        return this.getClass().getSimpleName();
    }
    
    @Override
    public String toString(){
        return this.getName() + " dough: " + dough.getName() + ", sauce: " + sauce.getName();
    }
}

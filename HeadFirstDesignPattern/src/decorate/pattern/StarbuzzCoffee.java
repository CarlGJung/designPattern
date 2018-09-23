package decorate.pattern;

/**
 *
 * @author wangchao
 */
public class StarbuzzCoffee {
    public static void main(String[] args){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
        
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
        
        Beverage beveraget = new Espresso(Beverage.TALL);
        System.out.println(beveraget.getDescription() + " $" + beveraget.cost());
        
        Beverage beveraget2 = new DarkRoast(Beverage.TALL);
        beveraget2 = new Mocha(beveraget2);
        beveraget2 = new Mocha(beveraget2);
        beveraget2 = new Whip(beveraget2);
        System.out.println(beveraget2.getDescription() + " $" + beveraget2.cost());
        
        Beverage beveraget3 = new HouseBlend(Beverage.TALL);
        beveraget3 = new Soy(beveraget3);
        beveraget3 = new Mocha(beveraget3);
        beveraget3 = new Whip(beveraget3);
        System.out.println(beveraget3.getDescription() + " $" + beveraget3.cost());
        
        Beverage beverageg = new Espresso(Beverage.GRANDE);
        System.out.println(beverageg.getDescription() + " $" + beverageg.cost());
        
        Beverage beverageg2 = new DarkRoast(Beverage.GRANDE);
        beverageg2 = new Mocha(beverageg2);
        beverageg2 = new Mocha(beverageg2);
        beverageg2 = new Whip(beverageg2);
        System.out.println(beverageg2.getDescription() + " $" + beverageg2.cost());
        
        Beverage beverageg3 = new HouseBlend(Beverage.GRANDE);
        beverageg3 = new Soy(beverageg3);
        beverageg3 = new Mocha(beverageg3);
        beverageg3 = new Whip(beverageg3);
        System.out.println(beverageg3.getDescription() + " $" + beverageg3.cost());
        
        Beverage beveragev = new Espresso(Beverage.VENTI);
        System.out.println(beveragev.getDescription() + " $" + beveragev.cost());
        
        Beverage beveragev2 = new DarkRoast(Beverage.VENTI);
        beveragev2 = new Mocha(beveragev2);
        beveragev2 = new Mocha(beveragev2);
        beveragev2 = new Whip(beveragev2);
        System.out.println(beveragev2.getDescription() + " $" + beveragev2.cost());
        
        Beverage beveragev3 = new HouseBlend(Beverage.VENTI);
        beveragev3 = new Soy(beveragev3);
        beveragev3 = new Mocha(beveragev3);
        beveragev3 = new Whip(beveragev3);
        System.out.println(beveragev3.getDescription() + " $" + beveragev3.cost());
    }
}

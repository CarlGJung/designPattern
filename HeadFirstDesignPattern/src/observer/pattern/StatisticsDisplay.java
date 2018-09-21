package observer.pattern;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author wangchao
 */
public class StatisticsDisplay implements DisplayElement, Observer{
    private ArrayList<Float> temperatures;
    private Subject weatherData;
    private DecimalFormat format;
    
    public StatisticsDisplay(Subject weatherData){
        this.temperatures = new ArrayList<>();
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
        this.format = new DecimalFormat("0.00");
    }
    @Override
    public void display() {
        float sum = 0F;
        float max = temperatures.get(0);
        float min = temperatures.get(0);
        
        for (float temperature : temperatures) {
            sum += temperature;
            max = Math.max(max, temperature);
            min = Math.min(min, temperature);
        }
        
        float avg = sum / temperatures.size();
        System.out.println("Avg/Max/Min: " + this.format.format(avg) + "/" + this.format.format(max) + "/" + this.format.format(min));
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperatures.add(temperature);
        display();
    }

}

package HeadFirst02;

import HeadFirst02.IMPL.ElementDisplay;
import HeadFirst02.IMPL.WeatherDate;
import HeadFirst02.ISubject.Subject;

public class WeatherStation {
    public static void main(String[] args){
        WeatherDate weatherData = new WeatherDate();
        ElementDisplay elementDisplay = new ElementDisplay(weatherData);
        weatherData.setElements(12,24,45);
        weatherData.setElements(24,48,90);
    }
}

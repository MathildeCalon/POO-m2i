package org.example;

public class Thermometer {
    private double temperatureKelvin;

    public Thermometer(double temperature, String degree) {
        if(degree.equals("celsius")){
            double converted = convertFromCelsius(temperature);
            this.temperatureKelvin = converted;
        } else if (degree.equals("fahrenheit")){
            double converted = convertFromFahrenheit(temperature);
            this.temperatureKelvin = converted;
        } else {
            this.temperatureKelvin = temperature;
        }
    }

    public double convertFromCelsius(double temperature){
        return temperature + 273.15;
    }
    public double convertFromFahrenheit(double temperature){
        return (temperature - 32) * 5/9 + 273.15;
    }

    public void setKelvin(double temperature) {
            this.temperatureKelvin = temperature;
    }
    public void setCelsius(double temperature){
        this.temperatureKelvin = convertFromCelsius(temperature);
    }
    public void setFahrenheit(double temperature) {
        this.temperatureKelvin = convertFromFahrenheit(temperature);
    }

    public double getTemperatureInKelvin() {
        return temperatureKelvin;
    }
    public double getTemperatureInCelsius(){
        return this.temperatureKelvin - 273.15;
    }
    public double getTemperatureInFahrenheit(){
        return (this.temperatureKelvin - 273.15) * 9/5 + 32;
    }
}

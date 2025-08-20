package com.dev;

public class Temparature {
	private double value;
	private String unit;
	
	
	public Temparature(double value, String unit){
		this.value=value;
		this.unit=unit;
	}
	
	// Converts the current temperature to Celsius and returns a new Temperature object. 
	
	public Temparature toCelsius() {
		if(this.unit.equalsIgnoreCase("F")) {
			return new Temparature((this.value-32)*5/9,"C");
		}else if(this.unit.equalsIgnoreCase("K")) {
			
			return new Temparature(this.value-273.15,"C");
			
		}
		
		return this;
	}
	
	// Converts the current temperature to Fahrenheit and returns a new Temperature object. 
	
	public Temparature toFahrenheit() {
		if(this.unit.equalsIgnoreCase("C")) {
			
			return new Temparature((this.value*9/5)+32,"F");
			
		}else if(this.unit.equalsIgnoreCase("K")) {
			
			return new Temparature((this.value - 273.15) * 9/5 + 32, "F");
			
		}
		
		
		return this;
	}
	
	
	// Converts the current temperature to Kelvin and returns a new Temperature object. 
	public Temparature toKelvin() {
		if(this.unit.equalsIgnoreCase("C")) {
			
			return new Temparature(this.value + 273.15, "K");
			
		}else if(this.unit.equals("F")) {
			
			return new Temparature((this.value - 32) * 5/9 + 273.15, "K");
			
		}
		
		return this;
	}
	
	
	
	// Returns the temperature value
	
	public double getValue() {
		return this.value;
	}
	
	
	// Returns the temperature unit.
	public String getUnit() {
		return this.unit;
	}
	
	
	
    public static void main(String[] args) {
        // Create a Temperature object
        Temparature tempInCelsius = new Temparature(30.0, "C");
        System.out.println("Original temperature: " + tempInCelsius.getValue() + "°" + tempInCelsius.getUnit());

        // Call instance methods on the object
        Temparature tempInFahrenheit = tempInCelsius.toFahrenheit();
        System.out.println("Converted to Fahrenheit: " + tempInFahrenheit.getValue() + "°" + tempInFahrenheit.getUnit());

        Temparature tempInKelvin = tempInFahrenheit.toKelvin();
        System.out.println("Converted to Kelvin: " + tempInKelvin.getValue() + tempInKelvin.getUnit());
    }
	
}

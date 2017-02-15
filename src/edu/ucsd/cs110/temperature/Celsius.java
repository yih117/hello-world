package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit(getValue() / 5.0f * 9.0f + 32.0f);
    }

    public String toString()
    {
        return getValue() + " C";
    }
}

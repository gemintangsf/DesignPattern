package Decorator.Food;

public abstract class Food 
{
    String description;

    public String getDescription()
    {
        return description;
    }

    public abstract double cost();
}
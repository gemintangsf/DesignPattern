package Decorator.Toppings;

import Decorator.Food.*;

public class Sosis extends ToppingDecorator
{
    private Food food;

    public Sosis(final Food food)
    {
        this.food = food;
    }

    @Override
    public String getDescription() 
    {
        return this.food.getDescription() + " Sosis";
    }

    @Override
    public double cost() 
    {
        return this.food.cost() + 2000.00;
    }
}
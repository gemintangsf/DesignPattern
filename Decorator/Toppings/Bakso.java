package Decorator.Toppings;

import Decorator.Food.*;

public class Bakso extends ToppingDecorator
{
    private Food food;

    public Bakso(final Food food)
    {
        this.food = food;
    }

    @Override
    public String getDescription() 
    {
        return this.food.getDescription() + " Bakso";
    }

    @Override
    public double cost() 
    {
        return this.food.cost() + 2000.00;
    }
}
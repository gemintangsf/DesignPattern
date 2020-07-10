package Strategy;

import Strategy.Discount.*;
import Strategy.Point.*;

public abstract class Membership
{
    private DiscountBehaviour discountBehaviourImp;
    private PointBehaviour pointBehaviourImp;

    public Membership(){}

    public void setDiscountBehaviourImp(DiscountBehaviour discountBehaviourImp) 
    {
        this.discountBehaviourImp = discountBehaviourImp;
    }

    public void setPointBehaviourImp(PointBehaviour pointBehaviourImp) 
    {
        this.pointBehaviourImp = pointBehaviourImp;
    }

    public double applyDiscount(double total)
    {
        return this.discountBehaviourImp.applyDiscount(total);
    }

    public int getPoint(double total)
    {
        return this.pointBehaviourImp.getPoint();
    }

    public abstract void display();
}
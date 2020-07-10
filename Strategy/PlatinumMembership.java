package Strategy;

import Strategy.Discount.*;
import Strategy.Point.*;

public class PlatinumMembership extends Membership
{
    public PlatinumMembership()
    {
        DiscountBehaviour platinumMemberDiscount = new PlatinumMemberDiscount();
        PointBehaviour platinumMemberPoint = new PlatinumMemberPoint();
        setDiscountBehaviourImp(platinumMemberDiscount);
        setPointBehaviourImp(platinumMemberPoint);
    }

    @Override
    public void display() 
    {
        System.out.println("This membership is Platinum. It gets 30% discount and every purchase will get 15 points");
    }
}
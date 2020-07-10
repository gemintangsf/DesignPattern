package Strategy;

import Strategy.Discount.*;
import Strategy.Point.*;

public class SilverMembership extends Membership
{
    public SilverMembership()
    {
        DiscountBehaviour silverMemberDiscount = new SilverMemberDiscount();
        PointBehaviour silverMemberPoint = new SilverMemberPoint();
        setDiscountBehaviourImp(silverMemberDiscount);
        setPointBehaviourImp(silverMemberPoint);
    }

    @Override
    public void display() 
    {
        System.out.println("This membership is Silver. It gets 10% discount and every purchase will get 5 points");
    }
}
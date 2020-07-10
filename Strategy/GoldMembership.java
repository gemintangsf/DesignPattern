package Strategy;

import Strategy.Discount.DiscountBehaviour;
import Strategy.Discount.GoldMemberDiscount;
import Strategy.Point.GoldMemberPoint;
import Strategy.Point.PointBehaviour;

public class GoldMembership extends Membership
{
    public GoldMembership()
    {
        DiscountBehaviour goldMemberDiscount = new GoldMemberDiscount();
        PointBehaviour goldMemberPoint = new GoldMemberPoint();
        setDiscountBehaviourImp(goldMemberDiscount);
        setPointBehaviourImp(goldMemberPoint);
    }

    @Override
    public void display() {
        System.out.println("This membership is Gold. It gets 20% discount and every purchase will get 10 points");
    }
}
package Strategy.Discount;

public class SilverMemberDiscount implements DiscountBehaviour
{
    final double DISCOUNT = 0.1;
    @Override
    public double applyDiscount(double total) 
    {
        return (total - getDiscount(total));
    }

    @Override
    public double getDiscount(double total) 
    {
        return (total * DISCOUNT);
    }
}
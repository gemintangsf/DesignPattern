package Strategy.Discount;

public class PlatinumMemberDiscount implements DiscountBehaviour
{
    final double DISCOUNT = 0.3;
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
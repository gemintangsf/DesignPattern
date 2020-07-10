package Decorator.Food;

public class NasiGoreng extends Food
{
    public NasiGoreng()
    {
        this.description = "Food.NasiGoreng";
    }

    @Override
    public double cost() {
        return 12000.00;
    }
}
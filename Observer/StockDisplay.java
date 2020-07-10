package Observer;

import java.util.HashSet;
import java.util.Iterator;

public class StockDisplay implements Observer
{
    @Override
    public void update(HashSet products)
    {
        Iterator<Product> itr = products.iterator();
        while(itr.hasNext())
        {
            System.out.println((itr.next().toString()));
        }
        System.out.println();
    }
}
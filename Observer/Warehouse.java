package Observer;

import java.util.*;
public class Warehouse implements Subject
{
    private ArrayList<Observer> observers;
    private HashSet<Product> products;

    public Warehouse()
    {
        this.observers = new ArrayList<Observer>();
        this.products = new HashSet<Product>();
    }

    public void addProduct(Product newProduct)
    {
        if(products.add(newProduct))
        {
            System.out.println("Product is sucessfully added");
        }
        else
        {
            System.out.println("Product is already exist");
        }
    }

    public void addProductStock(String productName, int additionStock)
    {
        try 
        {
            this.findProduct(productName).addStock(additionStock);
            notifyObservers();

        } catch (NullPointerException e) 
        {
            System.out.println("Product isn't exist");
        }
    }

    public Product findProduct(String productName)
    {
        Iterator<Product> i = this.products.iterator();

        while(i.hasNext())
        {
            Product temp = (Product) i.next();
            
            if (temp.getProductName().equals(productName))
                return temp;
        }
        return null;
    }

    @Override
    public void addObserver(Observer observer) 
    {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) 
    {
        int index = observers.indexOf(observer);
        if(index >= 0) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() 
    {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(this.products);
        }
    }
}
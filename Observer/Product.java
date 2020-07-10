package Observer;

public class Product 
{
    private String productName;
    private int stock;

    public Product(String productName, int stock)
    {
        this.productName = productName;
        this.stock = stock;
    }

    public String getProductName() 
    {
        return productName;
    }

    public int getStock() 
    {
        return stock;
    }

    private void setStock(int stock)
    {
        this.stock = stock;
    }

    public void addStock(int additions)
    {
        setStock(getStock() + additions);
    }

    @Override
    public String toString() 
    {
        return ("Product: " + productName + ", stock: " + stock);
    }
}
package Proxy;

public class Database 
{
    private String name;

    public Database(String name) 
    {
        this.name = name;
    }

    public void connect() 
    {
        System.out.println("Connecting to " + this.name + "...");
    }

    public void insertRow(String row) 
    {
        System.out.println("Adding " + row + " into database....");
    }

    public void disconnect() 
    {
        System.out.println("Diconnecting from " + this.name + "...");
    }
}
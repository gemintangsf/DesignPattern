package Proxy;

public class MainClass 
{
    public static void main(String[] args) 
    {
        String[] rowToAdd = { "Marissa,2010", "Nur,2020", "Amalia,2030" };

        ProxyDatabase proxy = new ProxyDatabase("DB.AKUNMAHASISWA", 2);
        for (String row : rowToAdd) 
        {
            proxy.insertRow(row);
        }
    }
}
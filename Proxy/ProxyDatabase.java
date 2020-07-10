package Proxy;

import java.util.ArrayList;

public class ProxyDatabase 
{
    private String name;
    private int threshold;
    private ArrayList<String> query;

    public ProxyDatabase(String name, int threshold) 
    {
        this.name = name;
        this.threshold = threshold;
        this.query = new ArrayList<String>();
    }

    public void insertRow(String row) 
    {
        System.out.println("Adding row to proxy " + row + " into database....");
        this.query.add(row);

        this.update();
    }

    private void update() 
    {
        if (this.query.size() > this.threshold) 
        {
            Database temp = new Database(this.name);

            temp.connect();
            for (String row : query) 
            {
                temp.insertRow(row);
            }
            this.query.clear();
            temp.disconnect();
        }
    }
}
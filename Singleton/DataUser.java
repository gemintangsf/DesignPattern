package Singleton;

public class DataUser 
{
    private static DataUser instance = null;
    private String name;

    private DataUser(String name)
    {
        this.name = name;
    }

    public static DataUser auth(String name)
    {
        if (DataUser.instance == null) 
        {
            DataUser.instance = new DataUser(name);
        }
        return DataUser.instance;
    }

    public static void deauth() 
    {
        System.out.println("Deauthentificating...");
        DataUser.instance = null;
    }

    public String getName()
    {
        return name;
    }
}
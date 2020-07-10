package Singleton;

public class MainClass {
    public static void main(String[] args) 
    {
        DataUser currentDataUser;

        currentDataUser = DataUser.auth("Marissa");
        System.out.println("Current Data User Name: " + currentDataUser.getName());

        currentDataUser = DataUser.auth("Nur");
        System.out.println("Current Data User Name: " + currentDataUser.getName());

        DataUser.deauth();
        currentDataUser = DataUser.auth("Nur");
        System.out.println("Current Data User Name: " + currentDataUser.getName());
    }   
}
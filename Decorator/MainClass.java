package Decorator;

import Decorator.Food.*;
import Decorator.Toppings.*;

public class MainClass 
{
    public static void main(String[] args) 
    {
        Food makanan1 = new NasiGoreng();

        Food nasiGorengBakso = new Bakso(makanan1);
        Food nasiGorengSosis = new Sosis(makanan1);
        Food nasiGorengBaksoSosis = new Sosis(nasiGorengBakso);

        System.out.println(nasiGorengBakso.getDescription() + " harga: " + nasiGorengBakso.cost());
        System.out.println(nasiGorengSosis.getDescription() + " harga: " + nasiGorengSosis.cost());
        System.out.println(nasiGorengBaksoSosis.getDescription() + " harga: " + nasiGorengBaksoSosis.cost());
    }    
}
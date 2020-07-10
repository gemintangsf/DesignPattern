package Facade;

import Facade.Transaction.*;

public class MainClass 
{
    public static void main(String[] args) 
    {
        TransactionFacade ATM = new TransactionFacade(new PinAuth(), new Menu(), new Transfer(), new Withdraw());  
        
        ATM.transfertransaction();

        System.out.println();
        ATM.withdrawTransaction();
    }    
}
package Facade;

import Facade.Transaction.*;

public class TransactionFacade 
{
    private PinAuth pinAuth;
    private Menu menu;
    private Transfer transfer;
    private Withdraw withdraw;

    public TransactionFacade(PinAuth pinAuth, Menu menu, Transfer transfer, Withdraw withdraw)
    {
        this.menu = menu;
        this.pinAuth = pinAuth;
        this.transfer = transfer;
        this.withdraw = withdraw;
    }

    public void withdrawTransaction()
    {
        pinAuth.insertPin();
        pinAuth.validPin();
        menu.showMenu();
        withdraw.execute();
    }

    public void transfertransaction()
    {
        pinAuth.insertPin();
        pinAuth.validPin();
        menu.showMenu();
        transfer.execute(); 
    }
}
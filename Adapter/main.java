/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author GemintangSangkajiFurqon
 */
public class main {
    public static void main (String args[]){
        BugattiVeyron bv = new BugattiVeyron();
        double SPID = 1301;
        MovableAdapterImpl ma = new MovableAdapterImpl();
        
        System.out.println("bv =" + bv.getSpeed() + "ma =" + ma.convertMPHtoKMPH(SPID));
    }
        
}

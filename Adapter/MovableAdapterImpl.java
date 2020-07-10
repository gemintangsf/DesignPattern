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
public class MovableAdapterImpl implements MovableAdapter {
    private Movable luxuryCars;
    
    // standard constructors
 
    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(luxuryCars.getSpeed());
    }
    
    double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }
}



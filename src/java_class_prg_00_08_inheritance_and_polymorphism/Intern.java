/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_class_prg_00_08_inheritance_and_polymorphism;

/**
 *
 * @author kbsmith01
 */
public class Intern extends Hourly {
    public Intern(String name, double hours, double rate) {
        super(name, hours, rate);
    }
    
    @Override
    public void setHours(double hours) {
        if(hours > 40) {
            super.setHours(40.0);
        }
        else {
            super.setHours(hours);
        }
    }
    
    @Override
    public double getPay() {
        if(super.getHours() > 40) {
            super.setHours(40);
        }
        
        return super.getPay();
    }
}

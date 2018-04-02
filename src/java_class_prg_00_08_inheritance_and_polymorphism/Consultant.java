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
public class Consultant extends Hourly {
    private double travel;
    
    public Consultant(String name, double hours, double rate, double travel) {
        super(name, hours, rate);
        this.travel = travel;
    }
    
    @Override
    public double getPay() {
        return super.getPay() + travel;
    }
}

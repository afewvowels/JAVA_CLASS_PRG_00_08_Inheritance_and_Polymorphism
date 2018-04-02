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
public abstract class Hourly extends Employee {
    private double hours;
    private double rate;
    
    public Hourly(String name, double hours, double rate) {
        super(name);
        this.hours = hours;
        this.rate = rate;
    }
    
    protected double getHours() {
        return this.hours;
    }
    
    // Leave public for use by user
    public void setHours(double hours) {
        this.hours = hours;
    }
    
    @Override
    public double getPay() {
        return this.hours * this.rate;
    }
}

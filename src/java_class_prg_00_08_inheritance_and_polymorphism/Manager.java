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
public class Manager extends Salaried {
    private double bonus;
    
    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
    
    @Override
    public double getPay() {
        return super.getPay() + this.bonus;
    }
}

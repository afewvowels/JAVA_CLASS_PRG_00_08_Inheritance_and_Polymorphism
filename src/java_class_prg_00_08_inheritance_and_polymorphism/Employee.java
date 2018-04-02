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
public abstract class Employee {
    private String name;
    
    public Employee(String name) {
        this.name = name;
    }
    
    public abstract double getPay();
    
    public String getPayCheck() {
        return name + String.format("%02d", getPay());
    }
}

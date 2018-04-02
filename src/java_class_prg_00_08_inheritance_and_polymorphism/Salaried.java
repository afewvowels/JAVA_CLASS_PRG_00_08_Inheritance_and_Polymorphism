/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_class_prg_00_08_inheritance_and_polymorphism;

/**
 * A salaried employee has a yearly salary.
 * @author kbsmith01
 */
public class Salaried extends Employee {
    private double salary;
    
    public Salaried(String name, double salary) {
        super(name);
        this.salary = salary;
    }
    
    /**
     * Overrides abstract getPay in Employee abstract class
     * @return Salary as salary / 52.0 weeks in a year
     * @override Overrides getPay() in abstract class Employee
     */
    @Override
    public double getPay() {
        return this.salary / 52.0;
    }
}

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
    
    /**
     * Returns employee's name + pay for the week.
     * @return String of form "pay for name: $(pay)"
     */
    public String getPayCheck() {
        return "Pay for " + name + ": $" + String.format("%.2f", this.getPay());
    }
    
    public boolean equals(Object x) {
        if(x instanceof Employee) {
            Employee e = (Employee)x;
            
            return(name.equals(e.name));
        }
        else {
            return false;
        }
    }
}

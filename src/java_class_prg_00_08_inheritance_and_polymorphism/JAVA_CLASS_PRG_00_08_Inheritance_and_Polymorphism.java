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
public class JAVA_CLASS_PRG_00_08_Inheritance_and_Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        
        double total = 0.0;
        
        employees[0] = new Salaried("name", 25000);
        employees[1] = new Manager("name", 50000, 2500);
        employees[2] = new Consultant("name", 40, 35, 2500);
        employees[3] = new Intern("name", 40, 13);
        
        for(int i = 0; i < 4; i++) {
            total += employees[i].getPay();
            System.out.println(employees[i].getClass().getSimpleName());
            System.out.println(employees[i].getPayCheck());
            
        }
        
        System.out.println("Total pay for the week: $" +
                String.format("%.2f", total));
    }
    
}

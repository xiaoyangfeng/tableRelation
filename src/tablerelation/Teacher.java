/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablerelation;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Blue
 */
@Entity
public class Teacher extends Person{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private double salary;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Laptop laptop=new Laptop();

    public Teacher() {
    }

    public Teacher(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public void setLaptop(String model) {
        laptop.setModel(model);
    }
    
    
    
}

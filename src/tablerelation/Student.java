/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablerelation;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Blue
 */
@Entity
public class Student extends Person{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private double gpa;
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Notebook> notebooks= new ArrayList<>();

    public Student() {
    }

    public Student(String name,double gpa) {
        super(name);
        this.gpa = gpa;
        
    }
    
    public void addNotebook(Notebook notebook){
        notebooks.add(notebook);
    }

    public List<Notebook> getNotebooks() {
        return notebooks;
    }
    
    
    
}

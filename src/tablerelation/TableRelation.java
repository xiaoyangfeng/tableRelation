/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablerelation;

/**
 *
 * @author Blue
 */
public class TableRelation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student jack = new Student("jack", 3.4);
        Notebook notebook1 = new Notebook(100);
        jack.addNotebook(notebook1);
        Notebook notebook2 = new Notebook(120);
        jack.addNotebook(notebook2);
        Notebook notebook3 = new Notebook(60);
        jack.addNotebook(notebook3);

        Student john = new Student("john", 3.2);
        Notebook notebook4 = new Notebook(200);
        john.addNotebook(notebook4);
        Notebook notebook5 = new Notebook(50);
        john.addNotebook(notebook5);
        
        Student jill = new Student("jill", 3.6);
        Notebook notebook6 = new Notebook(300);
        jill.addNotebook(notebook6);
        
        Teacher jim= new Teacher("jim", 45000);
        jim.setLaptop("dell");
        
        Teacher jasmin= new Teacher("jasmin", 46000);
        jasmin.setLaptop("mac");

        MyPersister myPersister = new MyPersister("tableRelationPU");

        myPersister.persist(jack);
        myPersister.persist(john);
        myPersister.persist(jill);
        myPersister.persist(jim);
        myPersister.persist(jasmin);
        System.out.println(MyCRUD.deleteStudent(1));
        
        myPersister.close();

    }

}

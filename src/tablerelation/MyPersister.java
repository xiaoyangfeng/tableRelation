/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablerelation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Blue
 */
public class MyPersister {
    private EntityManagerFactory emf;
    private EntityManager em;

    public MyPersister(String puName) {
        init(puName);
    }

    private void init(String puName){
        emf = Persistence.createEntityManagerFactory(puName);
        em=emf.createEntityManager();
    }

    public void start(String puName){
        if(emf==null){
            init(puName);
        }
    }


    public void close(){
        em.close();
        emf.close();
        emf=null;
    }

    public <T> void persist(T t){
        EntityTransaction et=em.getTransaction();
        et.begin();
        em.persist(t);
        et.commit();
    }

    public boolean remove(int id){
        
        Student student=em.find(Student.class, id);
        if (student!=null){
        EntityTransaction et=em.getTransaction();
        et.begin();
        em.remove(student);
        et.commit();
        return true;
        }
        return false;
    }
}

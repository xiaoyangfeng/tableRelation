/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablerelation;

import javax.persistence.EntityTransaction;

/**
 *
 * @author Blue
 */
public class MyCRUD {

    public static boolean deleteStudent(int studentId) {
        MyPersister myPersister = new MyPersister("tableRelationPU");
        return myPersister.remove(studentId);
        
    }
}

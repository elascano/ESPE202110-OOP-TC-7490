/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.classdiagram.model;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class A {
    private ArrayList<A> as;

    public A(ArrayList<A> as) {
        this.as = as;
    }

    /**
     * @return the as
     */
    public ArrayList<A> getAs() {
        return as;
    }

    /**
     * @param as the as to set
     */
    public void setAs(ArrayList<A> as) {
        this.as = as;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.uml.model;

/**
 *
 * @author WINDOWS 10
 */
public class C {
    private D ds[]=new D[10];

    @Override
    public String toString() {
        return "C{" + "ds=" + ds + '}';
    }

    public C() {
    }
    
    
    public C(D ds[]) {
        this.ds=ds;
    }
    
    public E m(){
        return new E();
    }

    /**
     * @return the ds
     */
    public D[] getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(D[] ds) {
        this.ds = ds;
    }
}
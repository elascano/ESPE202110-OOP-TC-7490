
package ec.edu.espe.uml.view;

import ec.edu.espe.uml.model.A;
import ec.edu.espe.uml.model.B;
import ec.edu.espe.uml.model.C;
import ec.edu.espe.uml.model.D;
import ec.edu.espe.uml.model.E;

/**
 *
 * @author ASUS
 */
public class UMLExcercise {
    public static void main(String[] args) {
        A a;
        B b;
        C c;
        D d;
        E e;
        int p=10;
        String q="-------------> Hellow Alexiz<--------------";
        C cs[]=new C[15];
        D ds[]=new D[10];
        
        a=new A(p, q);
        b=new B(cs);
        c=new C(ds);
        d=new D();
        e=new E();
        
        System.out.println("a -->"+a);
        a.m(b);
        
        System.out.println("c -->"+c);
        
        System.out.println("d -->"+d);
        System.out.println("e -->"+e);
        
        
    }
    
}

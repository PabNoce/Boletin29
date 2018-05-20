package boletin29;

import java.util.ArrayList;


public class Boletin29 {

    public static void main(String[] args) {
        ArrayList<Barcos> lista=new ArrayList();
        
Barcos v=new Veleros(2,2,2.5,"asdf");
Barcos y=new Yates(3.5,3,3,3.5,"basd");
Barcos dm=new DeportivasMotor(4.5,4,4.5,"asde");
Factura f=new Factura();
lista.add(y);

    }
    
}

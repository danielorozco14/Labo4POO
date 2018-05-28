/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author LN710Q
 */
public class Resta implements Calculadora {

     public double Datos(double a,double b) {
        double c;
        c= a-b;
        return c;
    }

    @Override
    public int Binarios(int a) {
        throw new UnsupportedOperationException(); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}

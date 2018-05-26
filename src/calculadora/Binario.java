/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */
public class Binario implements Calculadora {

    @Override
    public float Datos(float a, float b) {
        throw new UnsupportedOperationException(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Binarios(double a) {
        double exp, digito;
        double binario;
 
        exp = 0;
        binario = 0;
        while (a != 0) {
            digito = a % 2;
            binario = binario + digito * Math.pow(10, exp);
            exp++;
            a = a/ 2;
        }
        return binario;

    }

}

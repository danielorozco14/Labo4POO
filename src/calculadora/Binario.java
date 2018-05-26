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
    public int Binarios(int a) {
        int r;
        String b = "";
        while (a != 0) {
            r = a % 2;
            b = r + b;
            a /= 2;
        }
        int bin=Integer.parseInt(b);
        return bin;

    }

}

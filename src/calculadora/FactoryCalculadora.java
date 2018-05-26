/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import corto.labo.pkg4.AbstractFactory;

/**
 *
 * @author LN710Q
 */
public class FactoryCalculadora implements AbstractFactory {

    @Override
    public Calculadora getOperacion(int type) {

        switch (type) {
            case 1:
                return new Suma();
            case 2:
                return new Resta();
            case 3:
                return new Multiplicacion();
            case 4:
                return new Division();
        }

        return null;

    }

}

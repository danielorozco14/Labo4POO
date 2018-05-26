/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corto.labo.pkg4;
import calculadora.FactoryCalculadora;
/**
 *
 * @author LN710Q
 */
public class FactoryProducer {
    
    public static AbstractFactory getFactory(int type){
        return new FactoryCalculadora();       
    }
    
}

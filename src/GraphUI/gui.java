/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphUI;
import calculadora.Division;
import calculadora.Resta;
import calculadora.Suma;
import calculadora.Multiplicacion;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author LN710Q
 */


public class gui extends JFrame {
    
    private JTextField caja1,caja2,caja3;
    private JButton boton;

    public gui() {
        super("Calculadora");//SIRVE PARA LLAMAR AL CONSTRUCTOR DE JFRAME
        initialComponents();//INICIALIZANDO VALORES DE VENTANA
        
        boton.addActionListener(new ActionListener() {//AÑADE ESCUCHADOR DE EVENTOS DEL BOTON
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("HICE CLICK PAPUUUU:v");//SE COLOCAN LAS INSTRUCCIONES QUE VA REALIZAR EL BOTON CUANDO SE PRESIONE
                               
            }
        });
        
    }
    
    
    public void initialComponents(){
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        // AGREGANDO CAJA 1
                
        caja1=new JTextField();//INSTANCIANDO LA CAJA DE TEXTO 
        caja1.setBounds(65,50, 150, 30);//POSICION EN X, POSICION EN Y, ANCHO DE LA CAJA,ALTO DE LA CAJA
        Container contain= getContentPane();//EXTRAE EL PANEL QUE CONTIENE JFRAME
        
        //AGREGANDO CAJA 2 
        
        caja2=new JTextField();//INSTANCIANDO LA CAJA DE TEXTO 
        caja2.setBounds(65, 100, 150, 30);//POSICION EN X, POSICION EN Y, ANCHO DE LA CAJA,ALTO DE LA CAJA
        contain=getContentPane();//EXTRAE EL PANEL QUE CONTIENE JFRAME
        
        // AGREGANDO CAJA 3
        
        caja3=new JTextField();//INSTANCIANDO LA CAJA DE TEXTO 
        caja3.setBounds(65,150, 150, 30);//POSICION EN X, POSICION EN Y, ANCHO DE LA CAJA,ALTO DE LA CAJA
        contain=getContentPane();//EXTRAE EL PANEL QUE CONTIENE JFRAME
        
        //AGREGANDO BOTON
        
        boton=new JButton("Resultado"); //INSTANCIANDO EL BOTON
        boton.setBounds(65,200, 150, 30);//POSICION EN X, POSICION EN Y, ANCHO DE LA CAJA,ALTO DE LA CAJA
        contain= getContentPane();   //EXTRAE EL PANEL QUE CONTIENE JFRAME
        
        
        //AGREGA LOS COMPONENTES A LA VENTANA
        
        contain.add(caja1);
        contain.add(caja2);
        contain.add(caja3);
        contain.add(boton);
        
               
        setSize(300,300); //SE SETEA EL TAMAÑO DE LA VENTANA
      
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new gui().setVisible(true);
            }
        });
    }
    
}



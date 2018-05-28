/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphUI;

import corto.labo.pkg4.AbstractFactory;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */
public class Menu extends JFrame {

    AbstractFactory factory;

    private JButton opciones1, opciones2, opciones3, opciones4,binario, salir;
    private static int Switch;
    
    public int getSwitch() {
        return Switch;
    }

    public void setSwitch(int Switch) {
        this.Switch = Switch;
    }
    
    public Menu() {
        super("Calculadora");
        setLocationRelativeTo(null);//PARA CERRAR TUS VENTANASA
        initialComponents();
        
        opciones1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                
                if(ae.getSource().equals(opciones1)){//.getSource() funciona para saber si un boton a sido presionado
                   setSwitch(1);
                }
                gui interfaz = new gui();
                interfaz.setVisible(true);
                System.out.println(getSwitch());
                Menu.this.dispose();
            }
        });
        
        
        opciones2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(ae.getSource().equals(opciones2)){
                   setSwitch(2);
                }
                gui interfaz = new gui();
                interfaz.setVisible(true);
                System.out.println(getSwitch());
                
                Menu.this.dispose();
            }
        });

        opciones3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(ae.getSource().equals(opciones3)){
                   setSwitch(3);
                }
                gui interfaz = new gui();
                interfaz.setVisible(true);
                System.out.println(getSwitch());
                Menu.this.dispose();
            }
        });

        opciones4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(ae.getSource().equals(opciones4)){
                   setSwitch(4);
                }
                gui interfaz = new gui();
                interfaz.setVisible(true);
                System.out.println(getSwitch());
                Menu.this.dispose();
            }
        });
        
        binario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(ae.getSource().equals(binario)){
                   setSwitch(5);
                }
                gui interfaz = new gui();
                interfaz.setVisible(true);
                System.out.println(getSwitch());
                Menu.this.dispose();
            }
        });
                

        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Menu.this.dispose();
            }
        });
    }

    

    public void initialComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);//Desde código,decimos DONDE  va cada botón, en qué posición va y qué tamaño ocupa en la ventana
        setResizable(true);// Sirve para habilitar o no, que se modifique el tamanio de la ventana
        Container contains ; //SE DECLARA UN CONTENEDOR, EL CUAL ALMACENA TODOS LOS ELEMENTOS QUE CONTENDRA LA VENTANA
        
        //AGREGANDO BOTON 1 
        opciones1 = new JButton("Suma");
        opciones1.setBounds(70, 50, 150, 30);
        contains = getContentPane();
        
        //AGREGANDO BOTON 2
        opciones2 = new JButton("Resta");
        opciones2.setBounds(70, 100, 150, 30);
        contains = getContentPane();
       
        //AGREGANDO BOTON 3
        opciones3 = new JButton("Multiplicación");
        opciones3.setBounds(70, 150, 150, 30);
        contains = getContentPane();
        
        //AGREGANDO BOTON 4
        opciones4 = new JButton("División");
        opciones4.setBounds(70, 200, 150, 30);
        contains = getContentPane();
        
        //AGREGANDO BOTON 5
        binario=new JButton("Decimal a Binario");
        binario.setBounds(70,250,150,30);
        contains=getContentPane();
        
        //AGREGANDO BOTON SALIR
        salir = new JButton("SALIR");
        salir.setBounds(70, 300, 150, 30);
        contains = getContentPane();

        //AGREGANDO LOS BOTONES AL PANEL
        contains.add(opciones1);
        contains.add(opciones2);
        contains.add(opciones3);
        contains.add(opciones4);
        contains.add(binario);
        contains.add(salir);
        setSize(300, 400); //SETEANDO TAMANIO DE LA VENTANA

    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
}

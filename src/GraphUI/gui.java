/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphUI;

import calculadora.Calculadora;
import corto.labo.pkg4.AbstractFactory;
import corto.labo.pkg4.FactoryProducer;

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

    private JTextField caja1, caja2, caja3;
    private JButton resultado, regresar;

    public gui() {
        super("Calculadora");//SIRVE PARA LLAMAR AL CONSTRUCTOR DE JFRAME
        Menu menu= new Menu();
        initComponents();//INICIALIZANDO VALORES DE VENTANA
                
        resultado.addActionListener(new ActionListener() {//AÑADE ESCUCHADOR DE EVENTOS DEL BOTON
            @Override
            public void actionPerformed(ActionEvent e) {

                AbstractFactory factory;
                Menu menu = new Menu();
                int n=(menu.getSwitch());

                float a = Integer.parseInt(caja1.getText());
                float b = Integer.parseInt(caja2.getText());

                factory = FactoryProducer.getFactory(n);
                Calculadora calcu = factory.getOperacion(n);
                String resultado = String.valueOf(calcu.Datos(a, b));//CONVIRTIENDO FLOAT C A STRING

                caja3.setText(resultado);

            }
        });

        regresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu menu = new Menu();
                menu.setVisible(true);
                gui.this.dispose();
            }
        });

    }

    public void initComponents() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // AGREGANDO CAJA 1
        caja1 = new JTextField();//INSTANCIANDO LA CAJA DE TEXTO 
        caja1.setBounds(90, 50, 150, 30);//POSICION EN X, POSICION EN Y, ANCHO DE LA CAJA,ALTO DE LA CAJA
        Container contain = getContentPane();//EXTRAE EL PANEL QUE CONTIENE JFRAME

        //AGREGANDO CAJA 2 
        caja2 = new JTextField();//INSTANCIANDO LA CAJA DE TEXTO 
        caja2.setBounds(90, 100, 150, 30);//POSICION EN X, POSICION EN Y, ANCHO DE LA CAJA,ALTO DE LA CAJA
        contain = getContentPane();//EXTRAE EL PANEL QUE CONTIENE JFRAME

        // AGREGANDO CAJA 3
        caja3 = new JTextField();//INSTANCIANDO LA CAJA DE TEXTO 
        caja3.setBounds(90, 200, 150, 30);//POSICION EN X, POSICION EN Y, ANCHO DE LA CAJA,ALTO DE LA CAJA
        contain = getContentPane();//EXTRAE EL PANEL QUE CONTIENE JFRAME

        //AGREGANDO BOTON
        resultado = new JButton("Resultado"); //INSTANCIANDO EL BOTON
        resultado.setBounds(90, 150, 150, 30);//POSICION EN X, POSICION EN Y, ANCHO DE LA CAJA,ALTO DE LA CAJA
        contain = getContentPane();   //EXTRAE EL PANEL QUE CONTIENE JFRAME

        regresar = new JButton("Regresar");
        regresar.setBounds(190, 300, 125, 30);
        contain = getContentPane();

        //AGREGA LOS COMPONENTES A LA VENTANA
        contain.add(caja1);
        contain.add(caja2);
        contain.add(caja3);
        contain.add(resultado);
        contain.add(regresar);

        setSize(350, 400); //SE SETEA EL TAMAÑO DE LA VENTANA

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

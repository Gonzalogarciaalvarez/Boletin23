/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin23;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ggarciaalvarez
 */
public class Boletin23_4 {
    JFrame marco1, marco2;
    JPanel panel1, panel2;
    JLabel mensaje;
    JButton boton;
    
    public Boletin23_4(){
        marco1 = new JFrame("Boletin 23.4");
        marco2 = new JFrame("Ventana secundaria");
        panel1 = new JPanel();
        panel2 = new JPanel();
        mensaje = new JLabel("Hola, soy la segunda pantalla");
        boton = new JButton("Cambio");
        
        marco1.setSize(400,200);
        marco2.setSize(400,100);
        panel1.add(boton);
        panel2.add(mensaje);
        marco1.add(panel1);
        marco2.add(panel2);
        cambio cam = new cambio();
        
        boton.addActionListener(cam);
        
        marco1.setLocationRelativeTo(marco1);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco1.setVisible(true);
    }    
    public class cambio implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Object boton1 = e.getSource();
            if(boton1 == boton){
            marco1.setVisible(false);
            marco2.setLocationRelativeTo(marco2);
            marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            marco2.setVisible(true);
        }
        }
        
    }
}

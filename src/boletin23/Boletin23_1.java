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
public class Boletin23_1 {
    JFrame marco;
    JPanel panel;
    JButton boton;
    JLabel texto;
    public Boletin23_1(){
        //Instanciamos los objetos
        marco = new JFrame("Boletin 23.1");
        panel = new JPanel();
        boton = new JButton("Púlsame");
        texto = new JLabel("");
        //Damos caracteristicas a los objetos
        marco.setSize(300,100);
        panel.add(texto);
        panel.add(boton);
        marco.add(panel);
        mensaje men = new mensaje();
        boton.addActionListener(men);
        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
    //Creamos una clase interna
    public class mensaje implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Object boton1 = e.getSource();
            if(boton1==boton){
                texto.setText("Has pulsado el botón");
            }
        }
        
    }
    
    
}

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
import javax.swing.JPanel;

/**
 *
 * @author ggarciaalvarez
 */
public class Boletin23_2 {
    JFrame marco;
    JPanel panel;
    JButton boton1, boton2;
    
    public Boletin23_2(){
    marco = new JFrame("Boletin 23.2");
    panel = new JPanel();
    boton1 = new JButton("Programacion");
    boton2 = new JButton("Bases");
    
    marco.setSize(300,100);
    panel.add(boton1);
    panel.add(boton2);
    marco.add(panel);
    titulo tit = new titulo();
    
    boton1.addActionListener(tit);
    boton2.addActionListener(tit);
    
    marco.setLocationRelativeTo(marco);
    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    marco.setVisible(true);
    
    }
    public class titulo implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Object boton = e.getSource();
            if(boton == boton1){
                marco.setTitle("Programacion");
            
            } else{
                marco.setTitle("Bases de datos");
            }
        }
        
    }
    
    
}

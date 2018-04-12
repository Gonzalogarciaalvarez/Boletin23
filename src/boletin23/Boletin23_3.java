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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ggarciaalvarez
 */
public class Boletin23_3 {
    JFrame marco;
    JPanel panel;
    JButton boton1, boton2;
    
    public Boletin23_3(){
        
        marco = new JFrame("Boletin 23.3");
        panel = new JPanel();
        boton1 = new JButton("Saludo");
        boton2 = new JButton("Despedida");
        
        marco.setSize(300,100);
        panel.add(boton1);
        panel.add(boton2);
        marco.add(panel);
        mensaje men = new mensaje();
        
        boton1.addActionListener(men);
        boton2.addActionListener(men);
        
        marco.setLocationRelativeTo(marco);
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
    
    public class mensaje implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Object boton = e.getSource();
            if(boton==boton1){
                JOptionPane.showMessageDialog(null,"Un saludo a DAM");
            }else{
                JOptionPane.showMessageDialog(null, "Fin do programa");
            }
        }
        
    }
    

}

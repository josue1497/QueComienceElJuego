/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.PanelJuego;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author Rental Servicios
 */
public class paneljuego extends JPanel{
    
    JPanel Retos, Contador, header, volver;
    JButton bVolver;
    JLabel lHeader, lContador, lRetos;
    
    public paneljuego(){
    
        this.setLayout(null);
        this.setBorder(new EmptyBorder(20, 10, 20, 10));
        this.setBackground(new Color(100,125,255));
        /*JLabel titulo=new JLabel("Tu Reto Es:");        
        titulo.setForeground(Color.white);
        titulo.setFont(new Font("Tahoma", 2, 20));
        titulo.setBounds(150, 20, 100, 40);*/
        //this.add(titulo,BorderLayout.NORTH);
        llenar_panel();
        
        
        
    }

   
    
    public void llenar_panel(){
        
       retos();
       volver();
       
       Retos.setBounds(20, 60, 350, 150);
       volver.setBounds(40, 470, 310, 70);
       
       this.add(Retos,BorderLayout.NORTH);
       this.add(volver,BorderLayout.SOUTH);
    
    }
    
    public void retos(){           
        
        lRetos=new JLabel("<html><div align=\\\"center\\\">Buena Suerte...<br>Selecciona tu Reto</div></html>");
        lRetos.setForeground(Color.white);
        lRetos.setFont(new Font("Tahoma", 2, 30));      
        
        Retos=new JPanel(new FlowLayout());
        Retos.setBorder(BorderFactory.createMatteBorder(1, 5, 1, 1, Color.red));
        Retos.setOpaque(false);
        
       
       
        Retos.add(lRetos);
    }
    public void volver(){
    
        volver=new JPanel();
        volver.setLayout(new GridLayout());
        bVolver =new JButton("Volver");        
        volver.add(bVolver,BorderLayout.SOUTH);
        
    }
}

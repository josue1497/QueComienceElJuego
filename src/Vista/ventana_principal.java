
package Vista;

import Controlador.Control_Pagina_Principal;
import Vista.PanelJuego.paneljuego;
import java.awt.*;
import javax.swing.*;

public class ventana_principal extends JFrame{
    
    private JPanel pPrincipal; 
    private JButton boton;
    private JLabel lRegistrar;
    public Dimension a;
    public paneljuego pj;
  
    Container c;
    
    
      
    public ventana_principal(){
    
        super("¿Cual Sera tu Reto?");
        vista();
        control();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setSize(400,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
       
           
    }
    
    public void vista(){
    
        c= getContentPane();
        
        construir_panelP(); 
        
        pj=new paneljuego();
        pj.setVisible(false);
        
        c.add(pPrincipal,BorderLayout.CENTER);
        c.add(pj,BorderLayout.CENTER);
        
    }
    
    public void control(){
    
        Control_Pagina_Principal c1=new Control_Pagina_Principal(this);
        
        boton.addActionListener(c1);
    
    }
    
    public void construir_panelP(){
    
        pPrincipal=new JPanel();
        pPrincipal.setLayout(null);
        pPrincipal.setBackground(new Color(100,125,255));
        pPrincipal.setSize(550,650);
        
        boton=new JButton("Jugar");
        boton.setBounds(120, 480, 150, 50);
        boton.setBackground(Color.white);
        boton.setBorderPainted(false);
        
        boton.setOpaque(true);
        
        lRegistrar=new JLabel("¿Eres atrevido?"
                + " Registra un nuevo reto");
        lRegistrar.setBounds(83, 530, 250, 40);
        lRegistrar.setForeground(Color.white);
        
        
        
        JLabel imagen=new JLabel();
        imagen.setIcon(new ImageIcon(getClass().getResource("/imagenes/icon.png")));
        imagen.setBounds(73, 10, 250, 250);
        
        panel_mov mov=new panel_mov(pPrincipal.getSize());
        mov.setBounds(-70,-12, 500, 600);
       
       
        
        mov.animar(true);
        
        
               
     pPrincipal.add(boton);
     pPrincipal.add(lRegistrar);
     pPrincipal.add(mov);
     
    }

    public JPanel getpPrincipal() {
        return pPrincipal;
    }

    public void setpPrincipal(JPanel pPrincipal) {
        this.pPrincipal = pPrincipal;
    }

    public JButton getBoton() {
        return boton;
    }

    public void setBoton(JButton boton) {
        this.boton = boton;
    }

    public JLabel getlRegistrar() {
        return lRegistrar;
    }

    public void setlRegistrar(JLabel lRegistrar) {
        this.lRegistrar = lRegistrar;
    }

    public Dimension getA() {
        return a;
    }

    public void setA(Dimension a) {
        this.a = a;
    }

    public Container getC() {
        return c;
    }

    public void setC(Container c) {
        this.c = c;
    }

    public paneljuego getPj() {
        return pj;
    }

    public void setPj(paneljuego pj) {
        this.pj = pj;
    }

    
      
       
}
    
   


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.panelRegistrarReto;

import java.awt.Color;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Rental Servicios
 */
public class registrarReto extends JPanel{
    
    JPanel pTitulo, pId_retp,pDescripcion, ptiempo, pBoton, pAutor;
    JTextField id_reto, tiempo, auitor;
    JTextArea descripcion;
    
    registrarReto(){
    
        this.setBackground(Color.red);
        this.setLayout(null);
        this.setBorder(new EmptyBorder(20, 10, 20, 20));
        
    }
    
    
    
}

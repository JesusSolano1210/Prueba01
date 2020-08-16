/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author esteb
 */
public class JFrameCovid extends JFrame {

    public JFrameCovid() {

        /*Panel que contendra lo que se desea mostrar en la seccion central de la ventana principal.
            se agrega en un jpanel aparte porque el BorderLayout de la ventana pricipal solo admite un componente 
            por seccion (arriba, abajo, izquierda, derecha, centro), si el componente no es visible sigue estando 
            agregado a la zona central.
        */
        panelCentral = new JPanel(new FlowLayout());        
        
        registroNovedades = new RegistroNovedades();
        formularioIngreso = new FormularioIngreso();
        menuLateral = new MenuLateral(this);

        registroNovedades.setVisible(false);
        //registroNovedades.setVisible(true);
        formularioIngreso.setVisible(false);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Covid-19");
        setLayout(new BorderLayout());
        setSize(900, 600);
        setLocationRelativeTo(null);
        //setResizable(false);

        panelCentral.add(registroNovedades);
        panelCentral.add(formularioIngreso);
        
        add(menuLateral, BorderLayout.WEST);
        add(panelCentral, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JFrameCovid();
    }

    public void setVisibleRegNovedades() {

        formularioIngreso.setVisible(false);
        registroNovedades.setVisible(true);
    }
    
    public void setVisibleFormIngreso() {

        registroNovedades.setVisible(false);
        formularioIngreso.setVisible(true);
    }
    
    private RegistroNovedades registroNovedades;
    private FormularioIngreso formularioIngreso;
    private MenuLateral menuLateral;
    private JPanel panelCentral;
}
/*
    
*/
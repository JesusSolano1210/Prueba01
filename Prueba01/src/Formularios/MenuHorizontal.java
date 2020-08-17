/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import prueba01.DialogoEmergente;

/**
 *
 * @author esteb
 */
public class MenuHorizontal extends javax.swing.JPanel {

    /**
     * Creates new form MenuHorizontal
     */
    public MenuHorizontal(JFrameCovid jfc) {
        initComponents();
        this.jfc = jfc;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCovid19 = new javax.swing.JLabel();
        jButtonClosed = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 194, 39));

        jLabelCovid19.setBackground(new java.awt.Color(0, 194, 39));
        jLabelCovid19.setFont(new java.awt.Font("Open Sans", 1, 30)); // NOI18N
        jLabelCovid19.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCovid19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelCovid19.setText("COVID-19");
        jLabelCovid19.setOpaque(true);

        jButtonClosed.setBackground(new java.awt.Color(0, 194, 39));
        jButtonClosed.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jButtonClosed.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClosed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/botonCerrar.png"))); // NOI18N
        jButtonClosed.setToolTipText("");
        jButtonClosed.setBorder(null);
        jButtonClosed.setBorderPainted(false);
        jButtonClosed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonClosed.setFocusPainted(false);
        jButtonClosed.setMaximumSize(new java.awt.Dimension(180, 32));
        jButtonClosed.setMinimumSize(new java.awt.Dimension(180, 32));
        jButtonClosed.setPreferredSize(new java.awt.Dimension(180, 32));
        jButtonClosed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonClosedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonClosedMouseExited(evt);
            }
        });
        jButtonClosed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClosedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabelCovid19, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 603, Short.MAX_VALUE)
                .addComponent(jButtonClosed, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonClosed, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCovid19))
                .addGap(4, 4, 4))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonClosedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonClosedMouseEntered
        jButtonClosed.setBackground(new Color(5, 123, 48));
    }//GEN-LAST:event_jButtonClosedMouseEntered

    private void jButtonClosedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonClosedMouseExited
        jButtonClosed.setBackground(new Color(0, 194, 39));
    }//GEN-LAST:event_jButtonClosedMouseExited

    private void jButtonClosedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClosedActionPerformed

        //int seleccion = JOptionPane.showOptionDialog(jfc, "Deseas Cerra la aplicacion", "Confirmarción", JOptionPane.YES_NO_OPTION,
          //      JOptionPane.QUESTION_MESSAGE, null, new Object[]{"SI", "NO"}, "NO");
        
        new DialogoEmergente(jfc, true);
        //if (seleccion == 0) 
          //  System.exit(0);

        
    }//GEN-LAST:event_jButtonClosedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClosed;
    private javax.swing.JLabel jLabelCovid19;
    // End of variables declaration//GEN-END:variables
    private JFrameCovid jfc;
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import java.awt.Color;

/**
 *
 * @author esteb
 */
public class MenuLateral extends javax.swing.JPanel {

    /**
     * Creates new form MenuLateral
     */
    public MenuLateral(JFrameCovid jfc) {
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
        jLabelLogo = new javax.swing.JLabel();
        jButtonIngreso = new javax.swing.JButton();
        jButtonSalidas = new javax.swing.JButton();
        jButtonPersonas = new javax.swing.JButton();
        jButtonNovedades = new javax.swing.JButton();
        jButtonReportes = new javax.swing.JButton();
        jButtonShowHiden = new javax.swing.JButton();

        jLabelCovid19.setBackground(new java.awt.Color(0, 194, 39));
        jLabelCovid19.setFont(new java.awt.Font("Open Sans", 1, 30)); // NOI18N
        jLabelCovid19.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCovid19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCovid19.setText("COVID-19");
        jLabelCovid19.setOpaque(true);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Logo-185x185.png"))); // NOI18N

        jButtonIngreso.setBackground(new java.awt.Color(0, 194, 39));
        jButtonIngreso.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jButtonIngreso.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIngreso.setText("Ingreso");
        jButtonIngreso.setToolTipText("");
        jButtonIngreso.setBorder(null);
        jButtonIngreso.setBorderPainted(false);
        jButtonIngreso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonIngreso.setFocusPainted(false);
        jButtonIngreso.setMaximumSize(new java.awt.Dimension(180, 32));
        jButtonIngreso.setMinimumSize(new java.awt.Dimension(180, 32));
        jButtonIngreso.setPreferredSize(new java.awt.Dimension(180, 32));
        jButtonIngreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonIngresoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonIngresoMouseExited(evt);
            }
        });
        jButtonIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresoActionPerformed(evt);
            }
        });

        jButtonSalidas.setBackground(new java.awt.Color(0, 194, 39));
        jButtonSalidas.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jButtonSalidas.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalidas.setText("Salidas");
        jButtonSalidas.setToolTipText("");
        jButtonSalidas.setBorder(null);
        jButtonSalidas.setBorderPainted(false);
        jButtonSalidas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalidas.setFocusPainted(false);
        jButtonSalidas.setMaximumSize(new java.awt.Dimension(180, 32));
        jButtonSalidas.setMinimumSize(new java.awt.Dimension(180, 32));
        jButtonSalidas.setPreferredSize(new java.awt.Dimension(180, 32));
        jButtonSalidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonSalidasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonSalidasMouseExited(evt);
            }
        });

        jButtonPersonas.setBackground(new java.awt.Color(0, 194, 39));
        jButtonPersonas.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jButtonPersonas.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPersonas.setText("Personas");
        jButtonPersonas.setToolTipText("");
        jButtonPersonas.setBorder(null);
        jButtonPersonas.setBorderPainted(false);
        jButtonPersonas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonPersonas.setFocusPainted(false);
        jButtonPersonas.setMaximumSize(new java.awt.Dimension(180, 32));
        jButtonPersonas.setMinimumSize(new java.awt.Dimension(180, 32));
        jButtonPersonas.setPreferredSize(new java.awt.Dimension(180, 32));
        jButtonPersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonPersonasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonPersonasMouseExited(evt);
            }
        });

        jButtonNovedades.setBackground(new java.awt.Color(0, 194, 39));
        jButtonNovedades.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jButtonNovedades.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNovedades.setText("Novedades");
        jButtonNovedades.setToolTipText("");
        jButtonNovedades.setBorder(null);
        jButtonNovedades.setBorderPainted(false);
        jButtonNovedades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNovedades.setFocusPainted(false);
        jButtonNovedades.setMaximumSize(new java.awt.Dimension(180, 32));
        jButtonNovedades.setMinimumSize(new java.awt.Dimension(180, 32));
        jButtonNovedades.setPreferredSize(new java.awt.Dimension(180, 32));
        jButtonNovedades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonNovedadesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonNovedadesMouseExited(evt);
            }
        });
        jButtonNovedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovedadesActionPerformed(evt);
            }
        });

        jButtonReportes.setBackground(new java.awt.Color(0, 194, 39));
        jButtonReportes.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jButtonReportes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReportes.setText("Reportes");
        jButtonReportes.setToolTipText("");
        jButtonReportes.setBorder(null);
        jButtonReportes.setBorderPainted(false);
        jButtonReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonReportes.setFocusPainted(false);
        jButtonReportes.setMaximumSize(new java.awt.Dimension(180, 32));
        jButtonReportes.setMinimumSize(new java.awt.Dimension(180, 32));
        jButtonReportes.setPreferredSize(new java.awt.Dimension(180, 32));
        jButtonReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonReportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonReportesMouseExited(evt);
            }
        });

        jButtonShowHiden.setBackground(new java.awt.Color(0, 194, 39));
        jButtonShowHiden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/botonVerticalClose.png"))); // NOI18N
        jButtonShowHiden.setToolTipText("");
        jButtonShowHiden.setBorder(null);
        jButtonShowHiden.setFocusPainted(false);
        jButtonShowHiden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowHidenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCovid19, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLogo)
                    .addComponent(jButtonIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNovedades, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jButtonShowHiden))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelCovid19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabelLogo)
                        .addGap(6, 6, 6)
                        .addComponent(jButtonIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButtonSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButtonPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButtonNovedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButtonReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonShowHiden, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIngresoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIngresoMouseEntered
        jButtonIngreso.setBackground(new Color(5, 123, 48));
    }//GEN-LAST:event_jButtonIngresoMouseEntered

    private void jButtonIngresoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIngresoMouseExited
        jButtonIngreso.setBackground(new Color(0, 194, 39));

    }//GEN-LAST:event_jButtonIngresoMouseExited

    private void jButtonSalidasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalidasMouseEntered
        jButtonSalidas.setBackground(new Color(5, 123, 48));
    }//GEN-LAST:event_jButtonSalidasMouseEntered

    private void jButtonSalidasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalidasMouseExited
        jButtonSalidas.setBackground(new Color(0, 194, 39));
    }//GEN-LAST:event_jButtonSalidasMouseExited

    private void jButtonPersonasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPersonasMouseEntered
        jButtonPersonas.setBackground(new Color(5, 123, 48));
    }//GEN-LAST:event_jButtonPersonasMouseEntered

    private void jButtonPersonasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPersonasMouseExited
        jButtonPersonas.setBackground(new Color(0, 194, 39));
    }//GEN-LAST:event_jButtonPersonasMouseExited

    private void jButtonNovedadesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNovedadesMouseEntered
        jButtonNovedades.setBackground(new Color(5, 123, 48));
    }//GEN-LAST:event_jButtonNovedadesMouseEntered

    private void jButtonNovedadesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNovedadesMouseExited
        jButtonNovedades.setBackground(new Color(0, 194, 39));
    }//GEN-LAST:event_jButtonNovedadesMouseExited

    private void jButtonReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonReportesMouseEntered
        jButtonReportes.setBackground(new Color(5, 123, 48));
    }//GEN-LAST:event_jButtonReportesMouseEntered

    private void jButtonReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonReportesMouseExited
        jButtonReportes.setBackground(new Color(0, 194, 39));
    }//GEN-LAST:event_jButtonReportesMouseExited

    private void jButtonShowHidenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowHidenActionPerformed

        if (jLabelCovid19.isVisible()) {
            jButtonShowHiden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/botonVerticalOpen.png"))); // NOI18N
            ocultarComponentes();
            
        }else{
            jButtonShowHiden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/botonVerticalClose.png"))); // NOI18N
            mostrarComponentes();
        }

    }//GEN-LAST:event_jButtonShowHidenActionPerformed

    private void jButtonIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresoActionPerformed
        jfc.setVisibleFormIngreso();
    }//GEN-LAST:event_jButtonIngresoActionPerformed

    private void jButtonNovedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovedadesActionPerformed
        jfc.setVisibleRegNovedades();
    }//GEN-LAST:event_jButtonNovedadesActionPerformed

    public void ocultarComponentes() {

        boolean mostrar = false;

        jLabelCovid19.setVisible(mostrar);
        jLabelLogo.setVisible(mostrar);
        jButtonIngreso.setVisible(mostrar);
        jButtonSalidas.setVisible(mostrar);
        jButtonPersonas.setVisible(mostrar);
        jButtonNovedades.setVisible(mostrar);
        jButtonReportes.setVisible(mostrar);
    }

    public void mostrarComponentes() {
        boolean mostrar = true;

        jLabelCovid19.setVisible(mostrar);
        jLabelLogo.setVisible(mostrar);
        jButtonIngreso.setVisible(mostrar);
        jButtonSalidas.setVisible(mostrar);
        jButtonPersonas.setVisible(mostrar);
        jButtonNovedades.setVisible(mostrar);
        jButtonReportes.setVisible(mostrar);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIngreso;
    private javax.swing.JButton jButtonNovedades;
    private javax.swing.JButton jButtonPersonas;
    private javax.swing.JButton jButtonReportes;
    private javax.swing.JButton jButtonSalidas;
    private javax.swing.JButton jButtonShowHiden;
    private javax.swing.JLabel jLabelCovid19;
    private javax.swing.JLabel jLabelLogo;
    // End of variables declaration//GEN-END:variables
    private JFrameCovid jfc;
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cajeroautomatico;

import java.awt.Image;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 * Esta es la clase ElegirT que representa la interfaz para la seleccion de tipo
 * de transeferencia que desea realizar ya sea a cuentas propias o a terceros y
 * asi pasar a la siguiente pantalla.
 */
public class ElegirT extends javax.swing.JFrame {

    private final String ci;
    private final String cuenta;
    private String texto;
    private ResourceBundle recursos;
    String idioma;

    /**
     * Constructor de la clase ElegirT.Inicializa los componentes de la
     * interfaz
     *
     * @param ci Carnet de identidad del usuario.
     * @param cuenta Número de cuenta del usuario.
     * @param idioma Idioma que se utilizará en la interfaz.
     */
    public ElegirT(String ci, String cuenta, String idioma) {
        this.ci = ci;
        this.cuenta = cuenta;
        this.idioma = idioma;
        Locale locale = new Locale(idioma);
        ResourceBundle recursos = ResourceBundle.getBundle("textos", locale);
        initComponents();
        texto = "<html>SELECCIONE EL TIPO DE TRANSFERENCIA QUE DESEA REALIZAR";
        lblTitulo.setText(texto);
        lblTitulo.setVerticalAlignment(JLabel.CENTER);
        lblTitulo.setHorizontalAlignment(JLabel.CENTER);
        this.setLocationRelativeTo(this);

        //Aqui se configura la direccion y se configura para que la imagen sea transparente.
        setImageButton(btnCPropias, "src/Imgenes/b1.png");
        btnCPropias.setOpaque(false);
        btnCPropias.setContentAreaFilled(false);
        btnCPropias.setBorderPainted(false);

        setImageButton(btnEspañol, "src/Imgenes/b1.png");
        btnEspañol.setOpaque(false);
        btnEspañol.setContentAreaFilled(false);
        btnEspañol.setBorderPainted(false);

        setImageButton(btnCTerceros, "src/Imgenes/b1.png");
        btnCTerceros.setOpaque(false);
        btnCTerceros.setContentAreaFilled(false);
        btnCTerceros.setBorderPainted(false);

        setImageButton(btnIngles, "src/Imgenes/b1.png");
        btnIngles.setOpaque(false);
        btnIngles.setContentAreaFilled(false);
        btnIngles.setBorderPainted(false);

        setImageButton(btnConfirmar, "src/Imgenes/b1.png");
        btnConfirmar.setOpaque(false);
        btnConfirmar.setContentAreaFilled(false);
        btnConfirmar.setBorderPainted(false);

        setImageButton(btnAtras, "src/Imgenes/b1.png");
        btnAtras.setOpaque(false);
        btnAtras.setContentAreaFilled(false);
        btnAtras.setBorderPainted(false);

    }

    /**
     * Metodo para cambiar el idioma de la interfaz grafica.
     *
     * @param idioma Idioma que se utilizara.
     */
    public void cambiarIdioma(String idioma) {
        Locale locale = new Locale(idioma);
        recursos = ResourceBundle.getBundle("textos", locale);
        if (idioma.equals("en")) {
            texto = "<html>SELECT THE TYPE OF TRANSFER YOU WANT TO MAKE";
        }
        if (idioma.equals("es")) {
            texto = "<html>SELECCIONE EL TIPO DE TRANSFERENCIA QUE DESEA REALIZAR";
        }
        if (idioma.equals("qu")) {
            texto = "<html>AKLLAY IMAYNA TRANSFERENCIA RUWAYTA MUNANKI";
        }
        lblTitulo.setText(texto);
        lblPropias.setText(recursos.getString("etiqueta.propias"));
        lblTerceros.setText(recursos.getString("etiqueta.terceros"));
        lblAtras.setText(recursos.getString("etiqueta.atras"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEspañol = new javax.swing.JButton();
        btnIngles = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnCPropias = new javax.swing.JButton();
        btnCTerceros = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblPropias = new javax.swing.JLabel();
        lblTerceros = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblAtras = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(0, 204, 0));

        btnEspañol.setMaximumSize(new java.awt.Dimension(80, 80));
        btnEspañol.setMinimumSize(new java.awt.Dimension(80, 80));
        btnEspañol.setPreferredSize(new java.awt.Dimension(80, 80));

        btnIngles.setMaximumSize(new java.awt.Dimension(80, 80));
        btnIngles.setMinimumSize(new java.awt.Dimension(80, 80));
        btnIngles.setPreferredSize(new java.awt.Dimension(80, 80));

        btnAtras.setMaximumSize(new java.awt.Dimension(80, 80));
        btnAtras.setMinimumSize(new java.awt.Dimension(80, 80));
        btnAtras.setPreferredSize(new java.awt.Dimension(80, 80));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEspañol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(btnEspañol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnIngles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 0));

        btnCPropias.setMaximumSize(new java.awt.Dimension(80, 80));
        btnCPropias.setMinimumSize(new java.awt.Dimension(80, 80));
        btnCPropias.setOpaque(true);
        btnCPropias.setPreferredSize(new java.awt.Dimension(80, 80));
        btnCPropias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCPropiasActionPerformed(evt);
            }
        });

        btnCTerceros.setMaximumSize(new java.awt.Dimension(80, 80));
        btnCTerceros.setMinimumSize(new java.awt.Dimension(80, 80));
        btnCTerceros.setPreferredSize(new java.awt.Dimension(80, 80));
        btnCTerceros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCTercerosActionPerformed(evt);
            }
        });

        btnConfirmar.setMaximumSize(new java.awt.Dimension(80, 80));
        btnConfirmar.setMinimumSize(new java.awt.Dimension(80, 80));
        btnConfirmar.setPreferredSize(new java.awt.Dimension(80, 80));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCPropias, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCTerceros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(btnCPropias, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnCTerceros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(504, 600));
        jPanel3.setMinimumSize(new java.awt.Dimension(504, 600));
        jPanel3.setPreferredSize(new java.awt.Dimension(504, 600));

        lblPropias.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lblPropias.setForeground(new java.awt.Color(0, 204, 51));
        lblPropias.setText("CUENTAS PROPIAS");

        lblTerceros.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lblTerceros.setForeground(new java.awt.Color(0, 204, 51));
        lblTerceros.setText("TERCEROS");

        lblTitulo.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 204, 0));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblTitulo.setToolTipText("");
        lblTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblAtras.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        lblAtras.setForeground(new java.awt.Color(0, 204, 51));
        lblAtras.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAtras.setText("ATRAS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPropias, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTerceros, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(lblPropias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(lblTerceros)
                .addGap(93, 93, 93)
                .addComponent(lblAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Accion que se realizara al presionar el boton CPropias pasadon a la
     * pantalla de cuentas propias para realizar la transferencia
     *
     * @param evt El evento de accion.
     */
    private void btnCPropiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCPropiasActionPerformed
        Propias pro = new Propias(ci, cuenta, idioma);
        pro.cambiarIdioma(idioma);
        pro.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCPropiasActionPerformed

    /**
     * Accion que se realizara al presionar el boton Terceros pasadon a la
     * pantalla de cuentas de terceros para realizar la transferencia donde
     * recibira por parametro el carnet, el numero de cuenta del usuario y el
     * idioma
     *
     * @param evt El evento de accion.
     */
    private void btnCTercerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCTercerosActionPerformed
        Terceros terceros = new Terceros(ci, cuenta, idioma);
        terceros.cambiarIdioma(idioma);
        terceros.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCTercerosActionPerformed

    /**
     * Accion que se realizara al presionar el boton Atras donde volvera a la
     * pantalla Sesion pasando los parametros de carnet, numero de cuenta del
     * usuario y idioma sin realizar ningun cambio
     *
     * @param evt El evento de accion.
     */
    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Sesion sesion = new Sesion(ci, cuenta, idioma);
        sesion.cambiarIdioma(idioma);
        sesion.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    /**
     * Aqui se configura para que el boton tenga un icono dimensionado
     *
     * @param buttonName El botón que se configurara.
     * @param root La ruta de la imagen que se usará como icono.
     */
    private void setImageButton(JButton buttonName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(buttonName.getWidth(), buttonName.getHeight(), Image.SCALE_DEFAULT));
        buttonName.setIcon(icon);
        this.repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCPropias;
    private javax.swing.JButton btnCTerceros;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnEspañol;
    private javax.swing.JButton btnIngles;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAtras;
    private javax.swing.JLabel lblPropias;
    private javax.swing.JLabel lblTerceros;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables

    void setVisible() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

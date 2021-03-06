package Tecnomundo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Milton
 */
public class VentanaIDAdminCliente extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form VentanaIDAdminCliente
     */
    public VentanaIDAdminCliente(String tipo) {
        initComponents();

        switch (tipo) {
            case "Modificar":
                configVentanaModificar();
                break;
            case "Eliminar":
                configVentanaEliminar();
                break;
            case "Consultar":
                configVentanaConsulta();
                break;
        }

        setControlador();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void setControlador() {
        botonAdmin.addActionListener(this);
        botonCancelar.addActionListener(this);
    }

    public void configVentanaModificar() {
        labelTitulo.setText("MODIFICAR CLIENTE");
        botonAdmin.setText("Modificar");
    }

    public void configVentanaEliminar() {
        labelTitulo.setText("ELIMINAR CLIENTE");
        botonAdmin.setText("Eliminar");
    }

    public void configVentanaConsulta() {
        labelTitulo.setText("CONSULTAR CLIENTE");
        botonAdmin.setText("Consultar");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        labelID = new javax.swing.JLabel();
        textID = new javax.swing.JTextField();
        botonCancelar = new javax.swing.JButton();
        botonAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 51, 102));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("ADMIN CLIENTE");

        labelID.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        labelID.setForeground(new java.awt.Color(51, 102, 255));
        labelID.setText("ID Cliente:");

        textID.setFont(new java.awt.Font("Kalinga", 0, 12)); // NOI18N

        botonCancelar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        botonCancelar.setText("Cancelar");

        botonAdmin.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        botonAdmin.setText("Admin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(labelID))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(botonAdmin)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonCancelar)
                            .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelID)
                    .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAdmin)
                    .addComponent(botonCancelar))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAdmin;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField textID;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            Integer.parseInt(textID.getText());
            if (ae.getActionCommand().equals("Modificar")) {
                VentanaAdminCliente ventanaModificarCliente = new VentanaAdminCliente("Modificar");
                ventanaModificarCliente.setLocationRelativeTo(this);
                ventanaModificarCliente.setVisible(true);
                this.dispose();
            }

            if (ae.getActionCommand().equals("Consultar")) {
                VentanaAdminCliente ventanaConsultarClientes = new VentanaAdminCliente("Consultar");
                ventanaConsultarClientes.setLocationRelativeTo(this);
                ventanaConsultarClientes.setVisible(true);
                this.dispose();
            }

            if (ae.getActionCommand().equals("Cancelar")) {
                this.dispose();
            }
        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null, "EL codigo no es valido");
            
        }

    }
}

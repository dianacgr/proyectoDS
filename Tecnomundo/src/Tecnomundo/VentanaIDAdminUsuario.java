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
public class VentanaIDAdminUsuario extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form VentanaIDAdminUsuario
     */
    public VentanaIDAdminUsuario(String tipo) {
        initComponents();
        
        switch(tipo){
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
    
    public void setControlador(){
        botonAdmin.addActionListener(this);
        botonCancelar.addActionListener(this);
    }
    
    public void configVentanaModificar(){
        labelTitulo.setText("MODIFICAR USUARIO");
        botonAdmin.setText("Modificar");
    }
    
    public void configVentanaEliminar(){
        labelTitulo.setText("ELIMINAR USUARIO");
        botonAdmin.setText("Eliminar");
    }
    
    public void configVentanaConsulta(){
        labelTitulo.setText("CONSULTAR USUARIO");
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
        botonAdmin = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 51, 102));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("ADMIN USUARIO");

        labelID.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        labelID.setForeground(new java.awt.Color(51, 102, 255));
        labelID.setText("ID Usuario:");

        textID.setFont(new java.awt.Font("Kalinga", 0, 12)); // NOI18N

        botonAdmin.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        botonAdmin.setText("Admin");

        botonCancelar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        botonCancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonAdmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textID, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)))
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAdmin)
                    .addComponent(botonCancelar))
                .addContainerGap(18, Short.MAX_VALUE))
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
        if(ae.getActionCommand().equals("Modificar")){
            if(textID.getText().equals("")) JOptionPane.showMessageDialog(this,"El ID no puede ser vacío");
            else{   VentanaAdminUsuario ventanaModificarUsuario = new VentanaAdminUsuario("Modificar");
                    ventanaModificarUsuario.setLocationRelativeTo(this);
                    ventanaModificarUsuario.setVisible(true);
                    this.dispose();
            }
        }
        
        if(ae.getActionCommand().equals("Consultar")){
            if(textID.getText().equals("")) JOptionPane.showMessageDialog(this,"El ID no puede ser vacío");
            else{   VentanaAdminUsuario ventanaConsultarUsuario = new VentanaAdminUsuario("Consultar");
                    ventanaConsultarUsuario.setLocationRelativeTo(this);
                    ventanaConsultarUsuario.setVisible(true);
                    this.dispose();
            }
        }
        
        if(ae.getActionCommand().equals("Eliminar")){
            if(textID.getText().equals("")) JOptionPane.showMessageDialog(this,"El ID no puede ser vacío");
            else{      JOptionPane.showMessageDialog(null, "Implementame! D:");
                       this.dispose();}
        }
        
        if(ae.getActionCommand().equals("Cancelar")){
            this.dispose();
        }
    }
}

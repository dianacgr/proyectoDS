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
public class VentanaAdminUsuario extends javax.swing.JFrame implements ActionListener{
    
    

    /**
     * Creates new form VentanaCrearUsuario
     */
    public VentanaAdminUsuario(String tipo) {
        
        
        
        initComponents();
        
        switch(tipo){
            case "Modificar":
                configVentanaModificar();
                break;
            case "Crear":
                configVentanaCrear();
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
        textLogin.setEditable(false);
    }
    
    public void configVentanaCrear(){
        labelTitulo.setText("CREAR USUARIO");
        botonAdmin.setText("Crear");
    }
    
    public void configVentanaConsulta(){
        labelTitulo.setText("CONSULTAR USUARIO");
        botonAdmin.setText("Continuar");
        textDireccion.setEditable(false);
        textLogin.setEditable(false);
        textNombre.setEditable(false);
        textNroID.setEditable(false);
        textTelefono.setEditable(false);
        textContraseña.setEditable(false);
        comboTdoc.setEditable(false);
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
        labelLogin = new javax.swing.JLabel();
        textLogin = new javax.swing.JTextField();
        labelDireccion = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        labelContraseña = new javax.swing.JLabel();
        labelTdoc = new javax.swing.JLabel();
        labelNroID = new javax.swing.JLabel();
        botonAdmin = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        textNombre = new javax.swing.JTextField();
        textDireccion = new javax.swing.JTextField();
        textTelefono = new javax.swing.JTextField();
        textContraseña = new javax.swing.JPasswordField();
        textNroID = new javax.swing.JTextField();
        comboTdoc = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 51, 102));
        labelTitulo.setText("ADMIN USUARIO");

        labelLogin.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        labelLogin.setForeground(new java.awt.Color(51, 102, 255));
        labelLogin.setText("Login:");

        textLogin.setFont(new java.awt.Font("Kalinga", 0, 12)); // NOI18N

        labelDireccion.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        labelDireccion.setForeground(new java.awt.Color(51, 102, 255));
        labelDireccion.setText("Dirección:");

        labelNombre.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(51, 102, 255));
        labelNombre.setText("Nombre:");

        labelTelefono.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        labelTelefono.setForeground(new java.awt.Color(51, 102, 255));
        labelTelefono.setText("Teléfono:");

        labelContraseña.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        labelContraseña.setForeground(new java.awt.Color(51, 102, 255));
        labelContraseña.setText("Contraseña:");

        labelTdoc.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        labelTdoc.setForeground(new java.awt.Color(51, 102, 255));
        labelTdoc.setText("T. Doc Id:");

        labelNroID.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        labelNroID.setForeground(new java.awt.Color(51, 102, 255));
        labelNroID.setText("Nro Doc Id:");

        botonAdmin.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        botonAdmin.setText("Admin");

        botonCancelar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        botonCancelar.setText("Cancelar");

        textNombre.setFont(new java.awt.Font("Kalinga", 0, 12)); // NOI18N

        textDireccion.setFont(new java.awt.Font("Kalinga", 0, 12)); // NOI18N

        textTelefono.setFont(new java.awt.Font("Kalinga", 0, 12)); // NOI18N

        textContraseña.setFont(new java.awt.Font("Kalinga", 0, 12)); // NOI18N

        textNroID.setFont(new java.awt.Font("Kalinga", 0, 12)); // NOI18N

        comboTdoc.setFont(new java.awt.Font("Kalinga", 0, 12)); // NOI18N
        comboTdoc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTitulo)
                .addGap(129, 129, 129))
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNroID)
                        .addGap(43, 43, 43)
                        .addComponent(textNroID, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTelefono)
                        .addGap(59, 59, 59)
                        .addComponent(textTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelDireccion)
                        .addGap(53, 53, 53)
                        .addComponent(textDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNombre)
                        .addGap(62, 62, 62)
                        .addComponent(textNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonAdmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelLogin)
                        .addGap(79, 79, 79)
                        .addComponent(textLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelContraseña)
                            .addComponent(labelTdoc))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(comboTdoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(99, 99, 99))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLogin)
                    .addComponent(textLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDireccion)
                    .addComponent(textDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefono)
                    .addComponent(textTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelContraseña)
                    .addComponent(textContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTdoc)
                    .addComponent(comboTdoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNroID)
                    .addComponent(textNroID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAdmin)
                    .addComponent(botonCancelar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAdmin;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JComboBox comboTdoc;
    private javax.swing.JLabel labelContraseña;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNroID;
    private javax.swing.JLabel labelTdoc;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPasswordField textContraseña;
    private javax.swing.JTextField textDireccion;
    private javax.swing.JTextField textLogin;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textNroID;
    private javax.swing.JTextField textTelefono;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Modificar")){
            
            if(textContraseña.getText().equals("")||textDireccion.getText().equals("")||textLogin.getText().equals("")
                    ||textNombre.getText().equals("")||textNroID.getText().equals("")||textTelefono.getText().equals("")){
                JOptionPane.showMessageDialog(this, "No puede haber ningún campo vacío");
            }else JOptionPane.showMessageDialog(this, "Implementame");
        }
        
        if(ae.getActionCommand().equals("Continuar")){
            JOptionPane.showMessageDialog(null, "Implementame! D:");
            this.dispose();
        }
        
        if(ae.getActionCommand().equals("Crear")){
            if(textContraseña.getText().equals("")||textDireccion.getText().equals("")||textLogin.getText().equals("")
                    ||textNombre.getText().equals("")||textNroID.getText().equals("")||textTelefono.getText().equals("")){
                JOptionPane.showMessageDialog(this, "No puede haber ningún campo vacío");
            }else JOptionPane.showMessageDialog(this, "Implementame");
        }
        
        if(ae.getActionCommand().equals("Cancelar")){
            this.dispose();
        }
    }
}
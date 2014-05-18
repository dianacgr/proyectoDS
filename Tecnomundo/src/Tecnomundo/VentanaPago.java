package Tecnomundo;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Milton
 */
public class VentanaPago extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form VentanaPago
     */
    public VentanaPago() {
        initComponents();
        setControlador();
        
        agregarSubVentanaEfectivo();
    }
    
    public void agregarSubVentanaEfectivo(){
        subVentanaDebito.dispose();
        subVentanaCredito.dispose();
        
        javax.swing.GroupLayout panelSubVentanasLayout = new javax.swing.GroupLayout(panelSubVentanas);
        panelSubVentanas.setLayout(panelSubVentanasLayout);
        panelSubVentanasLayout.setHorizontalGroup(
            panelSubVentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
            .addGroup(panelSubVentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelSubVentanasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(subVentanaEfectivo)
                    .addContainerGap()))
        );
        panelSubVentanasLayout.setVerticalGroup(
            panelSubVentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
            .addGroup(panelSubVentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelSubVentanasLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(subVentanaEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        subVentanaEfectivo.setVisible(true);
    }

    public void agregarSubVentanaDebito(){
        subVentanaEfectivo.dispose();
        subVentanaCredito.dispose();
        javax.swing.GroupLayout panelSubVentanasLayout = new javax.swing.GroupLayout(panelSubVentanas);
        panelSubVentanas.setLayout(panelSubVentanasLayout);
        panelSubVentanasLayout.setHorizontalGroup(
            panelSubVentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
            .addGroup(panelSubVentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelSubVentanasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(subVentanaDebito)
                    .addContainerGap()))
        );
        panelSubVentanasLayout.setVerticalGroup(
            panelSubVentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
            .addGroup(panelSubVentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelSubVentanasLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(subVentanaDebito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        subVentanaDebito.setVisible(true);
    }
    
    public void agregarSubVentanaCredito(){
        subVentanaEfectivo.dispose();
        subVentanaCredito.dispose();
          javax.swing.GroupLayout panelSubVentanasLayout = new javax.swing.GroupLayout(panelSubVentanas);
        panelSubVentanas.setLayout(panelSubVentanasLayout);
        panelSubVentanasLayout.setHorizontalGroup(
            panelSubVentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
            .addGroup(panelSubVentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelSubVentanasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(subVentanaCredito)
                    .addContainerGap()))
        );
        panelSubVentanasLayout.setVerticalGroup(
            panelSubVentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
            .addGroup(panelSubVentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelSubVentanasLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(subVentanaCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        subVentanaCredito.setVisible(true);
    }    
 
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        subVentanaEfectivo = new javax.swing.JInternalFrame();
        labelValorPagarEfectivo = new javax.swing.JLabel();
        textValorPagarEfectivo = new javax.swing.JTextField();
        labelEfectivoRecibido = new javax.swing.JLabel();
        textCantidadEfectivo = new javax.swing.JTextField();
        labelDevolucion = new javax.swing.JLabel();
        textDevolucion = new javax.swing.JTextField();
        botonCalcularDevolucion = new javax.swing.JButton();
        botonPagarEfectivo = new javax.swing.JButton();
        labelTituloEfectivo = new javax.swing.JLabel();
        subVentanaDebito = new javax.swing.JInternalFrame();
        labelValorPagarDebito = new javax.swing.JLabel();
        textValorPagarDebito = new javax.swing.JTextField();
        labelNroTarjeta = new javax.swing.JLabel();
        textNroTarjeta = new javax.swing.JTextField();
        botonPagarDebito = new javax.swing.JButton();
        labelTituloDebito = new javax.swing.JLabel();
        labelNroVerificacion = new javax.swing.JLabel();
        textNroVerificacion = new javax.swing.JTextField();
        subVentanaCredito = new javax.swing.JInternalFrame();
        labelValorPagarCredito = new javax.swing.JLabel();
        textValorPagarCredito = new javax.swing.JTextField();
        labelNroTarjetaCredito = new javax.swing.JLabel();
        textNroTarjetaCredito = new javax.swing.JTextField();
        labelNroCuotas = new javax.swing.JLabel();
        textNroCuotas = new javax.swing.JTextField();
        botonPagarCredito = new javax.swing.JButton();
        labelTituloCredito = new javax.swing.JLabel();
        labelNroVerificacionCredito = new javax.swing.JLabel();
        textNroVenta8 = new javax.swing.JTextField();
        labelFraccion = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        textFraccion = new javax.swing.JTextField();
        labelCantidadRestante = new javax.swing.JLabel();
        textCantidadRestante = new javax.swing.JTextField();
        labelMedioPago = new javax.swing.JLabel();
        comboMedioPago = new javax.swing.JComboBox();
        panelSubVentanas = new javax.swing.JPanel();
        botonCancelar = new javax.swing.JButton();

        subVentanaEfectivo.setVisible(true);

        labelValorPagarEfectivo.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        labelValorPagarEfectivo.setForeground(new java.awt.Color(51, 102, 255));
        labelValorPagarEfectivo.setText("Valor a Pagar:");

        textValorPagarEfectivo.setFont(new java.awt.Font("Kalinga", 0, 12)); // NOI18N

        labelEfectivoRecibido.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        labelEfectivoRecibido.setForeground(new java.awt.Color(51, 102, 255));
        labelEfectivoRecibido.setText("Cantidad Efectivo:");

        textCantidadEfectivo.setFont(new java.awt.Font("Kalinga", 0, 12)); // NOI18N

        labelDevolucion.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        labelDevolucion.setForeground(new java.awt.Color(51, 102, 255));
        labelDevolucion.setText("Devolución:");

        textDevolucion.setEditable(false);
        textDevolucion.setFont(new java.awt.Font("Kalinga", 0, 12)); // NOI18N

        botonCalcularDevolucion.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        botonCalcularDevolucion.setText("Calcular Devolución");

        botonPagarEfectivo.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        botonPagarEfectivo.setText("Pagar Efectivo");

        labelTituloEfectivo.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        labelTituloEfectivo.setForeground(new java.awt.Color(0, 51, 102));
        labelTituloEfectivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloEfectivo.setText("Efectivo");

        javax.swing.GroupLayout subVentanaEfectivoLayout = new javax.swing.GroupLayout(subVentanaEfectivo.getContentPane());
        subVentanaEfectivo.getContentPane().setLayout(subVentanaEfectivoLayout);
        subVentanaEfectivoLayout.setHorizontalGroup(
            subVentanaEfectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subVentanaEfectivoLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(labelTituloEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subVentanaEfectivoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(subVentanaEfectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelDevolucion)
                    .addGroup(subVentanaEfectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelEfectivoRecibido)
                        .addGroup(subVentanaEfectivoLayout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(labelValorPagarEfectivo))))
                .addGap(18, 18, 18)
                .addGroup(subVentanaEfectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonPagarEfectivo)
                    .addGroup(subVentanaEfectivoLayout.createSequentialGroup()
                        .addGroup(subVentanaEfectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textValorPagarEfectivo)
                            .addComponent(textCantidadEfectivo)
                            .addComponent(textDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(botonCalcularDevolucion)))
                .addGap(30, 30, 30))
        );
        subVentanaEfectivoLayout.setVerticalGroup(
            subVentanaEfectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subVentanaEfectivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTituloEfectivo)
                .addGap(18, 18, 18)
                .addGroup(subVentanaEfectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelValorPagarEfectivo)
                    .addComponent(textValorPagarEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subVentanaEfectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEfectivoRecibido)
                    .addComponent(textCantidadEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subVentanaEfectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDevolucion)
                    .addComponent(textDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCalcularDevolucion))
                .addGap(27, 27, 27)
                .addComponent(botonPagarEfectivo)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        subVentanaDebito.setVisible(true);

        labelValorPagarDebito.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        labelValorPagarDebito.setForeground(new java.awt.Color(51, 102, 255));
        labelValorPagarDebito.setText("Valor a Pagar:");

        textValorPagarDebito.setFont(new java.awt.Font("Kalinga", 0, 12)); // NOI18N

        labelNroTarjeta.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        labelNroTarjeta.setForeground(new java.awt.Color(51, 102, 255));
        labelNroTarjeta.setText("# Tarjeta:");

        textNroTarjeta.setFont(new java.awt.Font("Kalinga", 0, 12)); // NOI18N

        botonPagarDebito.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        botonPagarDebito.setText("Pagar Debito");

        labelTituloDebito.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        labelTituloDebito.setForeground(new java.awt.Color(0, 51, 102));
        labelTituloDebito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloDebito.setText("Tarjeta Debito");

        labelNroVerificacion.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        labelNroVerificacion.setForeground(new java.awt.Color(51, 102, 255));
        labelNroVerificacion.setText("# Verificación");

        textNroVerificacion.setEditable(false);
        textNroVerificacion.setFont(new java.awt.Font("Kalinga", 0, 12)); // NOI18N

        javax.swing.GroupLayout subVentanaDebitoLayout = new javax.swing.GroupLayout(subVentanaDebito.getContentPane());
        subVentanaDebito.getContentPane().setLayout(subVentanaDebitoLayout);
        subVentanaDebitoLayout.setHorizontalGroup(
            subVentanaDebitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subVentanaDebitoLayout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addGroup(subVentanaDebitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subVentanaDebitoLayout.createSequentialGroup()
                        .addGroup(subVentanaDebitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelValorPagarDebito)
                            .addComponent(labelNroTarjeta)
                            .addComponent(labelNroVerificacion))
                        .addGap(18, 18, 18)
                        .addGroup(subVentanaDebitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textValorPagarDebito)
                            .addComponent(textNroTarjeta)
                            .addComponent(textNroVerificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelTituloDebito, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(168, 168, 168))
            .addGroup(subVentanaDebitoLayout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(botonPagarDebito)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        subVentanaDebitoLayout.setVerticalGroup(
            subVentanaDebitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subVentanaDebitoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTituloDebito)
                .addGap(18, 18, 18)
                .addGroup(subVentanaDebitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelValorPagarDebito)
                    .addComponent(textValorPagarDebito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subVentanaDebitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNroTarjeta)
                    .addComponent(textNroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subVentanaDebitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNroVerificacion)
                    .addComponent(textNroVerificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonPagarDebito)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        subVentanaCredito.setVisible(true);

        labelValorPagarCredito.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        labelValorPagarCredito.setForeground(new java.awt.Color(51, 102, 255));
        labelValorPagarCredito.setText("Valor a Pagar:");

        textValorPagarCredito.setFont(new java.awt.Font("Kalinga", 0, 12)); // NOI18N

        labelNroTarjetaCredito.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        labelNroTarjetaCredito.setForeground(new java.awt.Color(51, 102, 255));
        labelNroTarjetaCredito.setText("# Tarjeta:");

        textNroTarjetaCredito.setFont(new java.awt.Font("Kalinga", 0, 12)); // NOI18N

        labelNroCuotas.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        labelNroCuotas.setForeground(new java.awt.Color(51, 102, 255));
        labelNroCuotas.setText("# Cuotas:");

        textNroCuotas.setFont(new java.awt.Font("Kalinga", 0, 12)); // NOI18N

        botonPagarCredito.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        botonPagarCredito.setText("Pagar Credito");

        labelTituloCredito.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        labelTituloCredito.setForeground(new java.awt.Color(0, 51, 102));
        labelTituloCredito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloCredito.setText("Tarjeta de Crédito");

        labelNroVerificacionCredito.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        labelNroVerificacionCredito.setForeground(new java.awt.Color(51, 102, 255));
        labelNroVerificacionCredito.setText("# Verificación");

        textNroVenta8.setEditable(false);
        textNroVenta8.setFont(new java.awt.Font("Kalinga", 0, 12)); // NOI18N

        javax.swing.GroupLayout subVentanaCreditoLayout = new javax.swing.GroupLayout(subVentanaCredito.getContentPane());
        subVentanaCredito.getContentPane().setLayout(subVentanaCreditoLayout);
        subVentanaCreditoLayout.setHorizontalGroup(
            subVentanaCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subVentanaCreditoLayout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addComponent(labelTituloCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
            .addGroup(subVentanaCreditoLayout.createSequentialGroup()
                .addGroup(subVentanaCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subVentanaCreditoLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(subVentanaCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelNroCuotas)
                            .addComponent(labelValorPagarCredito)
                            .addComponent(labelNroTarjetaCredito)
                            .addComponent(labelNroVerificacionCredito))
                        .addGap(18, 18, 18)
                        .addGroup(subVentanaCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textValorPagarCredito)
                            .addComponent(textNroTarjetaCredito)
                            .addComponent(textNroCuotas, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textNroVenta8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(subVentanaCreditoLayout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(botonPagarCredito)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        subVentanaCreditoLayout.setVerticalGroup(
            subVentanaCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subVentanaCreditoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTituloCredito)
                .addGap(18, 18, 18)
                .addGroup(subVentanaCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelValorPagarCredito)
                    .addComponent(textValorPagarCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subVentanaCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNroTarjetaCredito)
                    .addComponent(textNroTarjetaCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subVentanaCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNroCuotas)
                    .addComponent(textNroCuotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subVentanaCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNroVerificacionCredito)
                    .addComponent(textNroVenta8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonPagarCredito)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelFraccion.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        labelFraccion.setForeground(new java.awt.Color(51, 102, 255));
        labelFraccion.setText("Fracción #:");

        labelTitulo.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 51, 102));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("REALIZAR VENTA");

        textFraccion.setEditable(false);
        textFraccion.setFont(new java.awt.Font("Kalinga", 0, 12)); // NOI18N

        labelCantidadRestante.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        labelCantidadRestante.setForeground(new java.awt.Color(51, 102, 255));
        labelCantidadRestante.setText("Cantidad Restante a Pagar:");

        textCantidadRestante.setEditable(false);
        textCantidadRestante.setFont(new java.awt.Font("Kalinga", 0, 12)); // NOI18N

        labelMedioPago.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        labelMedioPago.setForeground(new java.awt.Color(51, 102, 255));
        labelMedioPago.setText("Medio de Pago:");

        comboMedioPago.setFont(new java.awt.Font("Kalinga", 0, 12)); // NOI18N
        comboMedioPago.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Efectivo", "Tarjeta Credito", "Tarjeta Debito" }));
        comboMedioPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMedioPagoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSubVentanasLayout = new javax.swing.GroupLayout(panelSubVentanas);
        panelSubVentanas.setLayout(panelSubVentanasLayout);
        panelSubVentanasLayout.setHorizontalGroup(
            panelSubVentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        panelSubVentanasLayout.setVerticalGroup(
            panelSubVentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );

        botonCancelar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        botonCancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(labelFraccion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textFraccion, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(labelCantidadRestante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textCantidadRestante, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(labelMedioPago)
                                .addGap(18, 18, 18)
                                .addComponent(comboMedioPago, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelSubVentanas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(botonCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFraccion)
                    .addComponent(textFraccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCantidadRestante)
                    .addComponent(textCantidadRestante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMedioPago)
                    .addComponent(comboMedioPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(panelSubVentanas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonCancelar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setControlador(){
        botonCalcularDevolucion.addActionListener(this);
        botonCancelar.addActionListener(this);
        botonPagarCredito.addActionListener(this);
        botonPagarDebito.addActionListener(this);
        botonPagarEfectivo.addActionListener(this);
        comboMedioPago.addActionListener(this);
    }
    
    private void comboMedioPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMedioPagoActionPerformed
        if(comboMedioPago.getSelectedIndex()==0){            
            agregarSubVentanaEfectivo();
        }
        
        if(comboMedioPago.getSelectedIndex()==1){            
            agregarSubVentanaCredito();
        }
        
        if(comboMedioPago.getSelectedIndex()==2){            
            agregarSubVentanaDebito();
        }
    }//GEN-LAST:event_comboMedioPagoActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCalcularDevolucion;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonPagarCredito;
    private javax.swing.JButton botonPagarDebito;
    private javax.swing.JButton botonPagarEfectivo;
    private javax.swing.JComboBox comboMedioPago;
    private javax.swing.JLabel labelCantidadRestante;
    private javax.swing.JLabel labelDevolucion;
    private javax.swing.JLabel labelEfectivoRecibido;
    private javax.swing.JLabel labelFraccion;
    private javax.swing.JLabel labelMedioPago;
    private javax.swing.JLabel labelNroCuotas;
    private javax.swing.JLabel labelNroTarjeta;
    private javax.swing.JLabel labelNroTarjetaCredito;
    private javax.swing.JLabel labelNroVerificacion;
    private javax.swing.JLabel labelNroVerificacionCredito;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelTituloCredito;
    private javax.swing.JLabel labelTituloDebito;
    private javax.swing.JLabel labelTituloEfectivo;
    private javax.swing.JLabel labelValorPagarCredito;
    private javax.swing.JLabel labelValorPagarDebito;
    private javax.swing.JLabel labelValorPagarEfectivo;
    private javax.swing.JPanel panelSubVentanas;
    private javax.swing.JInternalFrame subVentanaCredito;
    private javax.swing.JInternalFrame subVentanaDebito;
    private javax.swing.JInternalFrame subVentanaEfectivo;
    private javax.swing.JTextField textCantidadEfectivo;
    private javax.swing.JTextField textCantidadRestante;
    private javax.swing.JTextField textDevolucion;
    private javax.swing.JTextField textFraccion;
    private javax.swing.JTextField textNroCuotas;
    private javax.swing.JTextField textNroTarjeta;
    private javax.swing.JTextField textNroTarjetaCredito;
    private javax.swing.JTextField textNroVenta8;
    private javax.swing.JTextField textNroVerificacion;
    private javax.swing.JTextField textValorPagarCredito;
    private javax.swing.JTextField textValorPagarDebito;
    private javax.swing.JTextField textValorPagarEfectivo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Cancelar")){
           this.dispose();
        }
        
        if(ae.getActionCommand().equals("Calcular Devolución")){
            try{
                    Integer.parseInt(textCantidadEfectivo.getText());
                    JOptionPane.showMessageDialog(null, "Implementame D: !");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "La cantidad de efectivo debe ser numerica");
            }
           
        }
        
        if(ae.getActionCommand().equals("Pagar Efectivo")){
            try{
                    Integer.parseInt(textValorPagarEfectivo.getText());
                    JOptionPane.showMessageDialog(null, "Implementame D: !");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "La cantidad de efectivo a pagar debe ser numerica");
            }
        }
        
        if(ae.getActionCommand().equals("Pagar Debito")){
            try{
                    Integer.parseInt(textValorPagarDebito.getText());
                    Integer.parseInt(textNroTarjeta.getText());
                    JOptionPane.showMessageDialog(null, "Implementame D: !");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "La cantidad a pagar y el numero "
                        + "de la tarjeta deben ser valores numericos");
            }
        }
        
        if(ae.getActionCommand().equals("Pagar Credito")){
            try{
                    Integer.parseInt(textValorPagarCredito.getText());
                    Integer.parseInt(textNroTarjetaCredito.getText());
                    Integer.parseInt(textNroCuotas.getText());
                    JOptionPane.showMessageDialog(null, "Implementame D: !");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "La cantidad a pagar, el numero "
                        + "de la tarjeta y el numero de cuotas deben ser valores numericos");
            }
        }
        
    }

    
}

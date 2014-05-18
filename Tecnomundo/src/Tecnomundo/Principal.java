package Tecnomundo;


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
public class Principal {
    
    
    public static void main(String [] args){
        try{
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaBlueLightLookAndFeel");
        }
        catch(Exception exception){
            System.out.println("NO SE PUEDE CAMBIAR EL ASPECTO");
        }
     
        VentanaIngresarSistema ejecucion = new VentanaIngresarSistema();
        ejecucion.setLocationRelativeTo(null);
        ejecucion.setVisible(true);
    }
    
}

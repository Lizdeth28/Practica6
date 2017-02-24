/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriela
 */
import javax.swing.JOptionPane;
public class Practica6 {
 
    /*lo que se pretende mostrar
 
    *   Argentina   Buenos aires      cordoba       La plata
    *   Colombia    Bogota            Cali          Medellin
    *   Chile       Concepción        Santiago      Valparaiso
    *   Mexico      Ciudad Juárez     León          Monterrey 
    */
 
public static void main(String args []) {
 
    String [][] arrMulti ={  {"Agentina","Buenos Aires", "Cordoba", "La Plata"},
                             {"Colombia","Bogota", "Cali", "Medellin"},
                             {"Chile","Concepción", "Santiago", "Valparaiso"},
                             {"Mexico","Ciudad Juárez", "León", "Monterrey"},                             
                          };
 
    String ax="";
    
    for(int i=0; i<4; i++){
        for(int j=0; j<4; j++){
           arrMulti[i][j] = JOptionPane.showInputDialog("Ingresa el dato: ");
        }
        ax+="n";
    }
 
    JOptionPane.showMessageDialog(null, ax);
 
}
}

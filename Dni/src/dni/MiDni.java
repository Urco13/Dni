/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dni;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author urco1
 */
public class MiDni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Dni minuevoDni;
        try {
            minuevoDni = new Dni("469096666");
            System.out.println(minuevoDni.getNumeroDni());
        } catch (MultiplesExcepciones ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}

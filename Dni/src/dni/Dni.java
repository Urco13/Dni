/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dni;

/**
 *
 * @author urco1
 */
public class Dni {
    private String numeroDni="";
    private String numDni="";
    private static String comprobacion="TRWAGMYFPDXBNJZSQVHLCKE";
    public Dni(String dni) throws MultiplesExcepciones{
        if (comprobarNumero(dni)&&comprobarLetra(dni)) {
            this.numeroDni=dni;
        }
    }//fin constructor
    
    public boolean comprobarNumero(String entradDni) throws MultiplesExcepciones{
        boolean sw=true;
//        String numDni="";
        if(entradDni.length()==9){ 
        }
        else{
            throw new MultiplesExcepciones(2);
        }
        this.numDni=entradDni.substring(0, 8);
        for (int i = 0; i < this.numDni.length()||sw==false; i++) {
            if (Character.isDigit(this.numDni.charAt(i))) {
            }else{
                throw new MultiplesExcepciones(1);
            }
        }
        return sw;
    }
    public boolean comprobarLetra(String entradaDni) throws MultiplesExcepciones{
        boolean sw=true;
        String letraDni="";
        letraDni=entradaDni.substring(entradaDni.length()-1);
        if (Character.isLetter(letraDni.charAt(0))) {
        }else{
            throw new MultiplesExcepciones(3);
        }
        int numDniNum=Integer.parseInt(numDni);
        if(letraDni.compareTo(comprobacion.charAt(numDniNum%23)==0)){
            
        }
        return sw;
    }
    public String getNumeroDni() {
        return numeroDni;
    }
    
}//fin class

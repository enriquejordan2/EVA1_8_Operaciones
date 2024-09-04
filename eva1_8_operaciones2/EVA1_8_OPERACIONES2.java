/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_8_operaciones2;

/**
 *
 * @author Jose Enrique
 */
public class EVA1_8_OPERACIONES2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = "Enrique";
        String apellido = "Jordan";
        String nombreCom;
        //CADENAS DE TEXTO, LA OPERACION 
        //CONCATENACION--> UNIR CADENAS DE TEXTO
        //el operador de concatenacion es el +
        // cuando un simbolo tiene varias funciones 
        //se le llama sobrecarga (de operadores)
        nombreCom = nombre + " " + apellido;
        
        System.out.println("El nombre es: "+ nombre);
        System.out.println("El apellido es: "+ apellido);
        System.out.println("El nombre completo es: "+ nombreCom);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo081 {

    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        int opcion;
        String mensajeSuma;
        String mensajeSumaDos;
        mensajeSuma = obtenerTablaSumar(10, 9); // se invoca al método 
                                                       // obtenerTablaSumar
                                                       // y el valor que 
                                                       // devuelve se lo 
                                                       // almacena  en mensajeSuma
        
        mensajeSumaDos = obtenerTablaMultiplicar(10, 9);
        
        System.out.printf("%s\n", mensajeSuma);
        System.out.printf("%s\n", mensajeSumaDos);
        //Mariangel Rojas
        System.out.println("Ingrese uno para obtener la tabla de sumar e "
                + "ingrese dos para obtener la tabla de multiplicar");
        opcion = entrada.nextInt();
        
        if (opcion == 1){
            mensajeSuma = obtenerTablaSumar(10,9);
            System.out.printf("%s\n",mensajeSuma);   
        }else{
            if (opcion == 2){
                mensajeSumaDos = obtenerTablaMultiplicar(10,9);
                System.out.printf("%s\n",mensajeSumaDos);
               }else{
                System.out.println("Error"); 
            }
        }
        
    }
        
    public static String obtenerTablaSumar(int limite, int tabla){
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla + i;
            cadena = String.format("%s%d + %d = %d\n", cadena, tabla, i, 
                    operacion);
        }
        return cadena;        
    }
    
    public static String obtenerTablaMultiplicar(int limite, int tabla){
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, tabla, i, 
                    operacion);
        }
        return cadena;
        
    }
    
}

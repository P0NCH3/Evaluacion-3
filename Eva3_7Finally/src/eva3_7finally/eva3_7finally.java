/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7finally;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author usuario
 */

public class eva3_7finally {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Scanner captu = new Scanner(System.in);
            System.out.println("ingresa un número entero: ");
            int numero = captu.nextInt();
            System.out.println("El numero es: " + numero);
        }catch(InputMismatchException e){
            System.out.println("Este número no es estero");
        }finally{//SIEMPRE SE EJECUTA:
            //BLOQUE DE CODIGO CON INSTRUCCIONES QUE DEBEN EJECUTAR
            //SIN IMPORTAR QUE HAYA O NO EXCEPCIONES
            System.out.println("Esta linea siempre se va a ejecutar");
        }
        System.out.println("x-Se cerrara el programa-x");
    }
    
}
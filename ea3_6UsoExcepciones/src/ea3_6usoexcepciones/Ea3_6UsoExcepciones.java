/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ea3_6usoexcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ea3_6UsoExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeoi = 0;
        while(true){
           try{
         Scanner captu = new Scanner(System.in);
         
            System.out.println("Introduce un número");
            numeoi= captu.nextInt();
            break;
           }catch(InputMismatchException e){
               System.out.println("El valor no es valido, vuelve a intentarlo");
           }
           }
        System.out.println("El valor capturado es = " + numeoi);
        }
            

            
           
                
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3catch;

/**
 *
 * @author usuario
 */
public class Eva3_3Catch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try{//BLOQUE QUE INTENTA EJECUTAR UN CODIGO
            //QUE POTENCIALMENTE GENERA UNA EXCEPCIÓN
           int x = 5, y = 0;
           int resu = x/y; 
           System.out.println("Resultado= "+ resu);
        }catch(ArithmeticException e){
            //AQUI TENEMOS QUE RESOLVER LA EXCEPCIÓN
            e.printStackTrace();
        }
        System.out.println("Fin del programama????");
        
        
    }
    
}

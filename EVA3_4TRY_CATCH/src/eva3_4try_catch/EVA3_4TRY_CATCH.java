/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4try_catch;

/**
 *
 * @author usuario
 */
public class EVA3_4TRY_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        try {
        System.out.println("Introduce un valor entero: ");
        int valor = captu.nextInt();
        System.out.println("El valor es = " + valor);
        }catch(InputMismatchException e){
            e.printStackTrace();
        }
        System.out.println("Fin del programa");
    }
}

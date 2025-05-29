/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8throw;

/**
 *
 * @author usuario
 */
public class Eva3_8THROW {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        try{
        Persona perso = new Persona("Maximiliano", "Buitimea", -5);
        System.out.println("Datos: " + perso);
        }catch(RuntimeException e){
            System.out.println("Error en los datos ingresados");
        }
        System.out.println("Siga hasta poner el dato correcto");
    }
    
}


class Persona{
    private String Nombre;
    private String Apellidos;
    private int Edad;
    
    public Persona(String Nombre, String Apellidos, int Edad){
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        setEdad(Edad);
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        if(Edad < 0)
            throw new RuntimeException("La edad no puede ser un numero negativo");
        else
            this.Edad = Edad;
    }
    
    @Override
    public String toString(){
        return "Datos de la persona:  \n" + 
                "Nombre:" + Nombre + "\n" +
                "Apellidos:" + Apellidos + "\n"+
                "Edad:" + Edad;
    }
    
}
    


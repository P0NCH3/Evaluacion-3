/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9throw;

/**
 *
 * @author usuario
 */
public class Eva3_9THROW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso = null;
        try{
            perso = new Persona("Maximiliano", "Buitimea", 6);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Datos: " + perso);
    }
    
}


class Persona{
    private String Nomb;
    private String Apellido;
    private int Edad;
    
    public Persona(){
        this.Nomb = "-----";
        this.Apellido = "-----";
        this.Edad = 0;
    }
    public Persona(String Nomb, String Apellido, int Edad) throws Exception{
        this.Nomb= Nomb;
        this.Apellido = Apellido;
        setEdad(Edad);
    }

    public String getNombre() {
        return Nomb;
    }

    public void setNombre(String Nomb) {
        this.Nomb = Nomb;
    }

    public String getApellidos() {
        return Apellido;
    }

    public void setApellidos(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) throws Exception {
        if(edad < 0)
            throw new Exception("La edad no puede ser un numero negativo");
        else
            this.Edad = Edad;
    }
    
    @Override
    public String toString(){
        return "\n" + "Nombre: "  + Nomb + "\n" +
                "Apellidos: " + Apellido + "\n"+
                "Edad: "  + Edad;
    }
    
}
    


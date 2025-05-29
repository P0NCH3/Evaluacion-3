/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_12serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/**
 *
 * @author usuario
 */
public class Eva3_12Serializable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         try {
            ecribirArchObj();
            leerArchObj();
        } catch (Exception ex) {
            System.out.println("Error");
        }
    }
    
    public static void leerArchObj() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream in = new FileInputStream("C:\\Archivos\\archiObjetos.poo");
        ObjectInputStream leerArch = new ObjectInputStream(in);
        while (true) {            
            Persona perso = ((Persona)leerArch.readObject());
            System.out.println(perso);
        }
    }
    
    private static void ecribirArchObj()throws IOException{
        FileOutputStream out = 
        new FileOutputStream("C:\\Archivos\\archiObjetos.poo", true);
        ObjectOutputStream guardarObj = new ObjectOutputStream(out);
            guardarObj.writeObject(new Persona("Jesus","Sandate",32));
            guardarObj.writeObject(new Persona("Josue","Olivarez",20));
            guardarObj.writeObject(new Persona("Martina","Rodriguez",24));
            guardarObj.writeObject(new Persona("Olivia","Sambo",35));
            guardarObj.flush();
            guardarObj.close();
    }
}


class Persona implements Serializable{
    private String nom;
    private String apellido;
    private int edad;

    public Persona(String nom, String apellido, int edad) {
        this.nom = nom;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nom;
    }

    public void setNombre(String nom) {
        this.nom = nom;
    }

    public String getApellidos() {
        return apellido;
    }

    public void setApellidos(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: "+nom+"\n"+
                "Apellidos: "+apellido+"\n"+
                "Edad: "+edad;
    }
    
    
}
    
    


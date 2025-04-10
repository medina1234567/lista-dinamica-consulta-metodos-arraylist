    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author SENA
 */
public class Persona_Modelo {
    private String nombrePersona;
    private String apellidoPersona;
    private int edadPersona;

//constructor
public Persona_Modelo(String nombre, String apellido, int edad){
 this.nombrePersona= nombre;
 this.apellidoPersona= apellido;
 this.edadPersona= edad;
}
//metodos de clase
public  void imprimirDatos(){
    System.out.println("Tu nombre es: " + this.nombrePersona);
    System.out.println("Tu apellido es:"+ this.apellidoPersona);
    System.out.println("Tu edad es: " + this.edadPersona);
}

// setters y getters

public String getnombrePersona(){
 return nombrePersona;
}

public void setnombrePersona(String nombrePersona){
 this.nombrePersona= nombrePersona;
}

public String getapellidoPersona(){
 return apellidoPersona;
}
public void setapellido(String apellidoPersona){
 this.apellidoPersona= apellidoPersona;
}

public int getEdadPersona(){
 return edadPersona;
 }

public void setEdadPersona(int edadPersona){
 this.edadPersona=edadPersona;
}











}

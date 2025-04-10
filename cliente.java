/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class cliente {
   private static String nombre;
   private static String apellido;
   private static String sexo;

public cliente(  String Apellido, String Sexo){
  cliente.apellido=Apellido;
  cliente.sexo=Sexo;
}

public static void setNombre_cliente(String Nombre){
cliente.nombre=Nombre;

}

public String getNombre_cliente(){
 String aux = cliente.nombre;
 return aux;
}

public static void imprimirDatos(){
    System.out.println("Nombre Cliente : " + cliente.nombre);
    System.out.println("Apelludo Cliente : " + cliente.apellido);
    System.out.println("Sexo del cliente : " + cliente.sexo);

}


 
}

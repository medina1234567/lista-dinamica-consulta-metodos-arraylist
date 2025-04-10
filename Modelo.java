/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import modelo.Persona_Modelo;
import modelo.cliente;
public class Modelo {
  private static Persona_Modelo [] listanombre_clientes;
   public static List<cliente> listaCliente= new ArrayList<>();
    
    public static void main(String[] args) {
      Modelo.crearArreglo_estatico();
     Modelo.mostrarDatos();

    }
   public static void crearArreglo_estatico(){
    Modelo.listanombre_clientes= new Persona_Modelo[3];
    Persona_Modelo objpersona = new Persona_Modelo  ("jessica" , "mejia" , 25);
    Modelo.listanombre_clientes[0]= objpersona;
    Modelo.listanombre_clientes[1]=  new Persona_Modelo  ("miguel" , "Lopez" , 22);
    Modelo.listanombre_clientes[2]=  new Persona_Modelo  ("cristian" , "castaño" , 40);
       System.out.println("se creo el array exitosamente");
} 
public static void mostrarDatos(){
 for(int i=0 ; i<Modelo.listanombre_clientes.length;i++){
    Persona_Modelo auxPersona = Modelo.listanombre_clientes[i];

 if(auxPersona != null){
     System.out.println((i+1) + ". Persona------");
     auxPersona.imprimirDatos();
   }else{
     System.out.println("No existen personas");

   }
 
  }
Modelo.ModificarNombre();
Modelo.RecorrerForeach();
}

public static void ModificarNombre(){
  Modelo.listanombre_clientes[0].setnombrePersona("Miguel");
  String auxNombre = listanombre_clientes[0].getnombrePersona();
    System.out.println("Se modifico el nombre de la persona por: "+ auxNombre);
 }
public static void RecorrerForeach(){
   for(Persona_Modelo cliente: Modelo.listanombre_clientes){
       System.out.println("cliente es " + cliente);
     if(cliente != null){
      cliente.imprimirDatos();
   }
  
  }
 }
public static void CrearArregloDinamico(){
 Modelo.listaCliente.add(new cliente("mariana", "perez"));
 Modelo.listaCliente.add(new cliente("danna", "sofia"));
 Modelo.listaCliente.add(new cliente("monica", "pinto"));


 }
}

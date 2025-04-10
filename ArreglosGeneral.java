/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysjava;

import arraysjava.arraylist;
public  class ArreglosGeneral {

    private static String[]listaNombres_clientes;
    public static void main(String[] args) {
     
     ArreglosGeneral.crearArreglo_estatico();
     ArreglosGeneral.mostrar_arreglos();
/// ejercicio ejemplo dos
     arraylist.crearArray_dinamico();
     arraylist.mostrarDatos();

   
}
   public static void crearArreglo_estatico(){
   ArreglosGeneral.listaNombres_clientes= new String[3];
   ArreglosGeneral.listaNombres_clientes[0]="CRISTIAN";
   ArreglosGeneral.listaNombres_clientes[1]="JOSE";
   ArreglosGeneral.listaNombres_clientes[2]="MICHAEL";
       System.out.println("se creo el array exitosamente");
   } 
 public static void mostrar_arreglos(){
 for (int i=0; i< ArreglosGeneral.listaNombres_clientes.length; i++){
     String auxN = ArreglosGeneral.listaNombres_clientes[i];
     System.out.println("hola :" + auxN);

 
 }
 
 
 }



}

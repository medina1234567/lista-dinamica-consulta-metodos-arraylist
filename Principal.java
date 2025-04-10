/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudiandoarray;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author SENA
 */
public class Principal {

   
    public static void main(String[] args) {

        // declaracion de una arraylist
    ArrayList<String> primero = new ArrayList<String>();
   for (int i = 1 ; i<=10; i++){
   
   primero.add("hola mundo" + i);

}
primero.add(3, "hola mundo 3");// añade otro parametro  aumentando en indice del arraylist

// declaracion del iterador 
 Iterator<String>NuevoIterador = primero.iterator();
while(NuevoIterador.hasNext()){
 String dato = NuevoIterador.next();
    System.out.println(dato+" / ");
 }


// otro array recorrido usando otro iterador 
 ArrayList<String> segundo;
        segundo = new ArrayList<>();
segundo.add("hairo");
segundo.add("carlos");
segundo.add("antonio");
 Iterator<String>it = segundo.iterator();// segundo iterator

        System.out.println(segundo);

while(it.hasNext()){// el hasNxt comprueba si hay un elemento siguiente 
  String nombre= it.next();
  if (nombre.equals("carlos")){
   it.remove();
}
   } 

        System.out.println(segundo);

}    

}
    


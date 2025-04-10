/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraysjava;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SENA
 */
public class arraylist {
    public static List<String> listaCliente= new ArrayList();

public static void crearArray_dinamico(){
  arraylist.listaCliente.add("cristian");
  arraylist.listaCliente.add("joel");
  arraylist.listaCliente.add("michael");

 }

public static void mostrarDatos(){
 for (int i=0; i<listaCliente.size(); i++){
    String lista = listaCliente.get(i);
     System.out.println(lista);
  }
}







}

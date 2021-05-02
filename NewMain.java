package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author David Llanes
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    int cont;
    boolean aceptado;
    static char [] algoritmo;
    
    public static void main(String[] args) {
     NewMain automata = new NewMain();
     System.out.println("Ingrese una cadena: \n");
     Scanner sc = new Scanner(System.in);
     String cadena;
     cadena = sc.nextLine();
     automata.algoritmo = cadena.toCharArray();
     automata.inicio();
     
     if(automata.aceptado == true)
     {
         System.out.println("Cadena Aceptada");
     }
     else
     {
         System.out.println("Cadena Rechazada");
     }
     
    }
     
     public void inicio(){
         cont = 0;
         aceptado = false;
         A();
     }
     
     public void A(){
         System.out.println("Estado A");
         aceptado = true;
         if(cont<algoritmo.length){
             if(algoritmo[cont]=='1'){
                 cont++;
                 A();
             }
             else if(algoritmo[cont]=='0'){
                cont++;
                B(); 
             }
             else if(algoritmo[cont]!= '0' || algoritmo[cont]!= '1')
             {
                 aceptado = false;
                 System.out.println("Cadena debe ser de 1 o 0.");
                 
             }
         }
     }
     
     public void B(){
         aceptado = true;
         System.out.println("Estado B");
         if(cont<algoritmo.length)
         {
             if(algoritmo[cont]=='1')
             {
                 cont++;
                 A();
             }
             else if(algoritmo[cont]=='0')
             {
                 cont++;
                 C();
             }
         }
    }
     
     public void C(){
         System.out.println("Estado C");
         aceptado = false;
         if(cont<algoritmo.length)
         {
             if(algoritmo[cont]=='1' || algoritmo[cont]== '0')
             {
                 cont++;
                 C();
                 
             }
         }
     }
     
}


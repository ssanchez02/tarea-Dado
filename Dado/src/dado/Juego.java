/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dado;

import java.util.Scanner;

/**
 *
 * @author Sebastián Sanchez
 */
public class Juego {
    private Dado dado1=new Dado();
    private Dado dado2=new Dado();
    private int sumaTotal;

    public int getSumaTotal() {
        return sumaTotal;
    }

    public void setSumaTotal(int sumaTotal) {
        this.sumaTotal = sumaTotal;
    }
    public int sumaTotal(){
     this.sumaTotal= this.dado1.lanzarDado()+this.dado2.lanzarDado();
     return this.sumaTotal;
    }
  
 
 public void menu(){
     boolean bandera=true;
     while(bandera){
         Scanner teclado=new Scanner(System.in);
         System.out.println("----------------------");
         System.out.println("Bienvenido al juego del dado\n1. Lanzar dados\n2.Salir ");
         int opcion=teclado.nextInt();
     switch(opcion){
          case 1:
              if(sumaTotal()==7){
                 System.out.println("Felicidades has ganado!!!!");   
              }else{
                  System.out.println("Mala suerte has perdido");
              }
          break;
          case 2:
          bandera=false;
      }
     }
   }
}

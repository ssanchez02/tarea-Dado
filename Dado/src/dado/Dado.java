/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dado;

/**
 *
 * @author Sebastián Sanchez
 */
public class Dado {

    private int caraSup;
    
      public Dado() {
        this.caraSup = 0;
    }
      
    public Dado(int caraSup){
        this.caraSup=caraSup;
    }
    
    public int getCaraSup() {
        return caraSup;
    }

    public void setCaraSup(int caraSup) {
        this.caraSup = caraSup;
    }
   
    public int lanzarDado(){
     return (int)(Math.random()*6)+1;
    }
    
    public void mostrarDado(){
    System.out.println(this.lanzarDado()+"El numero es:");
    }
}

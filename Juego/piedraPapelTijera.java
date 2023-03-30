package Juego;
import java.util.*;

public class piedraPapelTijera implements juego {
    //atributos
   private String nombre;
   private int eleccion;
   private int resultado;
   

   Scanner datos = new Scanner(System.in);


    public void inicio() {
        System.out.println("Digite el nombre del jugador");
        nombre = datos.next();
    }

  
    public void jugar() {
        System.out.println(nombre+" Realice su eleccion 1-piedra, 2-papel, 3-tijera ");
        eleccion = datos.nextInt();

        Random aleatorio = new Random();
        resultado=(int)(Math.random()*2+1);
    }

   
    public void finalizar() {
        if(eleccion == 1 && resultado == 1){
            System.out.println("Has empatado " +nombre);
        }else if(eleccion == 2 && resultado == 2){
            System.out.println("Has empatado " +nombre);
        }else if(eleccion == 3 && resultado == 3){
            System.out.println("Has empatado " +nombre);
        }else if(eleccion == 1 && resultado == 3){
            System.out.println("Has ganado " +nombre);
        }else if(eleccion == 2 && resultado == 1){
            System.out.println("Has ganado " +nombre);
        }else if(eleccion == 3 && resultado == 2){
            System.out.println("Has ganado " +nombre);
        }else if(eleccion == 1 && resultado == 2){
            System.out.println("Has perdido " +nombre);
        }else if(eleccion == 2 && resultado == 3){
            System.out.println("Has perdido " +nombre);
        }else if(eleccion == 3 && resultado == 1){
            System.out.println("Has perdido  " +nombre);
        }
    }
    
}

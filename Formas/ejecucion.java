package Formas;

import java.util.Scanner;

import Formas.rectangulo;

public class ejecucion {
    public static void main(String[] args) {
        float base;
        float altura;
        double radio;
        double pi=3.1416;
        int rta=0;

        Scanner recoger=new Scanner(System.in);
        
        System.out.println("Dijite un numero para sacar el area de la fugura 1=rectangulo 2= triangulo 3=corculo");
        rta=recoger.nextInt();

        if (rta == 1) {
            System.out.println("Digite el valor de la base");
            base=recoger.nextFloat();

            System.out.println("Digite el valor de la altura");
            altura=recoger.nextFloat();

            rectangulo figura=new rectangulo(base,altura);

            figura.calcularArea();
        } else if (rta == 2) {
            triangulo figura2=new triangulo(base,altura);

            System.out.println("Digite el valor de la base del triangulo");
            base=recoger.nextFloat();

            System.out.println("Digite el valor de la altura del triangulo");
            altura=recoger.nextFloat();

            figura2.calcularArea();
        } else if (rta == 3) {
            System.out.println("Digite el valor del radio del circulo");
            radio=recoger.nextDouble();
            circulo figura3=new circulo(radio,pi);
            
            figura3.calcularArea();
        }

        

        


    
        
    }
}

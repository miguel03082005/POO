package Juego;

public class Ejecucion {
    public static void main(String[] args) {
        piedraPapelTijera juego = new piedraPapelTijera();
        juego.inicio();
        juego.jugar();
        juego.finalizar();
    }
}

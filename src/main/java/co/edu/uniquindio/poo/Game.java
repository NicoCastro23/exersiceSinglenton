package co.edu.uniquindio.poo;

public class Game {
    //Atributos
    private String nombreJuego;

    //Constructor
    public Game(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }
    
    public void startGame() {
        System.out.println("inicia el juego");
    }

    public void endGame() {
        System.out.println("termina el juego");
    }

    public synchronized void updateScore(Player player, int newScore) {
        player.updateScore(newScore);
    }

    public String getNombreJuego() {
        return nombreJuego;
    }
} 

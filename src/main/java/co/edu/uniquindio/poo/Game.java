package co.edu.uniquindio.poo;

public class Game {
    private String nombreJuego;

    public Game(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }
    
    public void startGame() {
        System.out.println("inicia el juego");
    }

    public void endGame() {
        System.out.println("termina el juego");
    }

    public void updateScore(Player player, int newScore) {
        player.setScore(newScore);
    }

    public String getNombreJuego() {
        return nombreJuego;
    }
} 

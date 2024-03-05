package co.edu.uniquindio.poo;

/**
 *Juan Nicolas Castro
 *Juan Steban Acosta
 *Santiago Polania
 */
public class App {
    public static void main(String[] args) {
        // Crear instancia del jugador
        Player player1 = new Player("Niconcio", 0, "Ninguna información adicional");

        // Iniciar juego
        Game game = new Game("Rocket League");
        game.startGame();

        // Actualizar puntuación del jugador
        game.updateScore(player1, 100);

        // Registrar puntuación más alta
        HighScoreManager highScoreManager = HighScoreManager.getInstance();
        highScoreManager.recordScore(player1.getScore());

        // Finalizar juego
        game.endGame();

        // Obtener y mostrar la puntuación más alta
        int highestScore = highScoreManager.getHighestScore();
        System.out.println("La puntuación más alta es: " + highestScore);
    }
}

package co.edu.uniquindio.poo;

public class HighScoreManager {
    private static HighScoreManager instance;
    private int highestScore;

    //Constructor privado para evitar instancias fuera de la clase
    private HighScoreManager() {}

    public static HighScoreManager getInstance() {
        if (instance == null) {
            instance = new HighScoreManager();
        }
        return instance;
    }

    public void recordScore(int score) {
        if (score > highestScore) {
            highestScore = score;
        }
    }

    public int getHighestScore() {
        return highestScore;
    }
}

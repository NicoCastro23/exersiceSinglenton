package co.edu.uniquindio.poo;

public class Player {
    
    private String name;
    public int score;
    private String otherInfo;
    
    public Player(String name, int score, String otherInfo) {
        this.name = name;
        this.score = score;
        this.otherInfo = otherInfo;
    }


    
    public String getName() {
        return name;
    }
    
    public int getScore() {
        return score;
    }
    
    public String getOtherInfo() {
        return otherInfo;
    }
    
}

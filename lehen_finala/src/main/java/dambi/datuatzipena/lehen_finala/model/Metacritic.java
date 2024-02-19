package dambi.datuatzipena.lehen_finala.model;

public class Metacritic {
    public int score;
    public String url;
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public Metacritic(int score, String url) {
        this.score = score;
        this.url = url;
    }
    public Metacritic() {
    }

    
}

package dambi.datuatzipena.lehen_finala.model;

public class Pc_requirements {
    public String minimum;
    public String recommended;



    
    public Pc_requirements() {
    }
    public Pc_requirements(String minimum, String recommended) {
        this.minimum = minimum;
        this.recommended = recommended;
    }
    public String getMinimum() {
        return minimum;
    }
    public void setMinimum(String minimum) {
        this.minimum = minimum;
    }
    public String getRecommended() {
        return recommended;
    }
    public void setRecommended(String recommended) {
        this.recommended = recommended;
    }
    
}

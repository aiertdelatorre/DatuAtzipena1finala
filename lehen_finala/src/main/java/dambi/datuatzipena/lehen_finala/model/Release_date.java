package dambi.datuatzipena.lehen_finala.model;

public class Release_date {
    public boolean coming_soon;
    public String date;
    public boolean isComing_soon() {
        return coming_soon;
    }
    public void setComing_soon(boolean coming_soon) {
        this.coming_soon = coming_soon;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public Release_date(boolean coming_soon, String date) {
        this.coming_soon = coming_soon;
        this.date = date;
    }
    public Release_date() {
    }

    
}

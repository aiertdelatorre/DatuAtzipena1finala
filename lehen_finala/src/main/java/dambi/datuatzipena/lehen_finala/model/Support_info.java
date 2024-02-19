package dambi.datuatzipena.lehen_finala.model;

public class Support_info {
    public String url;
    public String email;
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Support_info(String url, String email) {
        this.url = url;
        this.email = email;
    }
    public Support_info() {
    }
    
}

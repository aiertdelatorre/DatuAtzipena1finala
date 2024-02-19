package dambi.datuatzipena.lehen_finala.model;

public class Screenshot {
    public int id;
    public String path_thumbnail;
    public String path_full;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPath_thumbnail() {
        return path_thumbnail;
    }
    public void setPath_thumbnail(String path_thumbnail) {
        this.path_thumbnail = path_thumbnail;
    }
    public String getPath_full() {
        return path_full;
    }
    public void setPath_full(String path_full) {
        this.path_full = path_full;
    }
    public Screenshot(int id, String path_thumbnail, String path_full) {
        this.id = id;
        this.path_thumbnail = path_thumbnail;
        this.path_full = path_full;
    }
    public Screenshot() {
    }

    
}

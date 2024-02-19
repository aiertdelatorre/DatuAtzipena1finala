package dambi.datuatzipena.lehen_finala.model;

public class Content_descriptors {
    public int[] ids;
    public String notes;
    public int[] getIds() {
        return ids;
    }
    public void setIds(int[] ids) {
        this.ids = ids;
    }
    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }
    public Content_descriptors(int[] ids, String notes) {
        this.ids = ids;
        this.notes = notes;
    }
    public Content_descriptors() {
    }
    
}

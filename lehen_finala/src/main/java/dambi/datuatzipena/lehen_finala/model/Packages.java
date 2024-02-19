package dambi.datuatzipena.lehen_finala.model;

public class Packages {
    public String name;
    public String title;
    public String description;
    public String selection_text;
    public String save_text;
    public int display_type;
    public String is_recurring_subscription;
    public Subs[] subs;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getSelection_text() {
        return selection_text;
    }
    public void setSelection_text(String selection_text) {
        this.selection_text = selection_text;
    }
    public String getSave_text() {
        return save_text;
    }
    public void setSave_text(String save_text) {
        this.save_text = save_text;
    }
    public int getDisplay_type() {
        return display_type;
    }
    public void setDisplay_type(int display_type) {
        this.display_type = display_type;
    }
    public String getIs_recurring_subscription() {
        return is_recurring_subscription;
    }
    public void setIs_recurring_subscription(String is_recurring_subscription) {
        this.is_recurring_subscription = is_recurring_subscription;
    }
    public Subs[] getSubs() {
        return subs;
    }
    public void setSubs(Subs[] subs) {
        this.subs = subs;
    }
    public Packages(String name, String title, String description, String selection_text, String save_text,
            int display_type, String is_recurring_subscription, Subs[] subs) {
        this.name = name;
        this.title = title;
        this.description = description;
        this.selection_text = selection_text;
        this.save_text = save_text;
        this.display_type = display_type;
        this.is_recurring_subscription = is_recurring_subscription;
        this.subs = subs;
    }
    public Packages() {
    }    
}

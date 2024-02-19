package dambi.datuatzipena.lehen_finala.model;

public class Subs {
    public int packageid;
    public String percent_savings_text;
    public int percent_savings;
    public String option_text;
    public String option_description;
    public String can_get_free_license;
    public boolean is_free_license;
    public int price_in_cents_with_discount;

    public int getPackageid() {
        return packageid;
    }
    public void setPackageid(int package_id) {
        this.packageid = package_id;
    }
    public String getPercent_savings_text() {
        return percent_savings_text;
    }
    public void setPercent_savings_text(String percent_savings_text) {
        this.percent_savings_text = percent_savings_text;
    }
    public int getPercent_savings() {
        return percent_savings;
    }
    public void setPercent_savings(int percent_savings) {
        this.percent_savings = percent_savings;
    }
    public String getOption_text() {
        return option_text;
    }
    public void setOption_text(String option_text) {
        this.option_text = option_text;
    }
    public String getOption_description() {
        return option_description;
    }
    public void setOption_description(String option_description) {
        this.option_description = option_description;
    }
    public String getCan_get_free_license() {
        return can_get_free_license;
    }
    public void setCan_get_free_license(String can_get_free_license) {
        this.can_get_free_license = can_get_free_license;
    }
    public boolean isIs_free_license() {
        return is_free_license;
    }
    public void setIs_free_license(boolean is_free_license) {
        this.is_free_license = is_free_license;
    }
    public int getPrice_in_cents_with_discount() {
        return price_in_cents_with_discount;
    }
    public void setPrice_in_cents_with_discount(int price_in_cents_with_discount) {
        this.price_in_cents_with_discount = price_in_cents_with_discount;
    }
    public Subs(int package_id, String percent_savings_text, int percent_savings, String option_text,
            String option_description, String can_get_free_license, boolean is_free_license,
            int price_in_cents_with_discount) {
        this.packageid = package_id;
        this.percent_savings_text = percent_savings_text;
        this.percent_savings = percent_savings;
        this.option_text = option_text;
        this.option_description = option_description;
        this.can_get_free_license = can_get_free_license;
        this.is_free_license = is_free_license;
        this.price_in_cents_with_discount = price_in_cents_with_discount;
    }
    public Subs() {
    }
    

    

}

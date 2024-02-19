package dambi.datuatzipena.lehen_finala.model;

public class Price_overview {
    public String currency;
    public int initial;
    public int finala ;
    public int discount_perenct;
    public String initial_formatted;
    public String final_formatted;





    
    public Price_overview() {
    }
    public Price_overview(String currency, int initial, int finala, int discount_perenct, String initial_formated,
            String final_formated) {
        this.currency = currency;
        this.initial = initial;
        this.finala = finala;
        this.discount_perenct = discount_perenct;
        this.initial_formatted = initial_formated;
        this.final_formatted = final_formated;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public int getInitial() {
        return initial;
    }
    public void setInitial(int initial) {
        this.initial = initial;
    }
    public int getFinala() {
        return finala;
    }
    public void setFinala(int finala) {
        this.finala = finala;
    }
    public int getDiscount_perenct() {
        return discount_perenct;
    }
    public void setDiscount_perenct(int discount_perenct) {
        this.discount_perenct = discount_perenct;
    }
    public String getInitial_formatted() {
        return initial_formatted;
    }
    public void setInitial_formatted(String initial_formated) {
        this.initial_formatted = initial_formated;
    }
    public String getFinal_formatted() {
        return final_formatted;
    }
    public void setFinal_formatted(String final_formated) {
        this.final_formatted = final_formated;
    }



    
}

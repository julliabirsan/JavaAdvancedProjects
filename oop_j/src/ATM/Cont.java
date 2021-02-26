package ATM;

public abstract class Cont {
    private double amount;
    private String valuta;
    private String iban;

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getValuta() {
        return valuta;
    }

    public void setValuta(String valuta) {
        this.valuta = valuta;
    }

    public final void adaugaSuma(double sum){
        this.amount +=sum;
    }
    public final void scadeSuma(double sum){
        this.amount -=sum;
    }

    public abstract void retragereBani(double sum, String valuta) throws FONDURI_INSUFICIENTE;
    public abstract void depunereBani(double sum, String valuta);

}

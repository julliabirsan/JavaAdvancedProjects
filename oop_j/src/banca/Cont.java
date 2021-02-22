package banca;

public abstract class Cont {
    private String iban;
    private double balanta;
    private String valuta;

    public abstract void transfer(double suma, Cont cont);

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getBalanta() {
        return balanta;
    }

    public void setBalanta(double balanta) {
        this.balanta = balanta;
    }

    public String getValuta() {
        return valuta;
    }

    public void setValuta(String valuta) {
        this.valuta = valuta;
    }
}

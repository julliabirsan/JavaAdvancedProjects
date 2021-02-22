package demo;

public class ContBancar {
    private long iban;//comun
    private String nume;//comun
    private double balanta;//comun
    private String valuta;//comun

    public ContBancar(long iban, String nume, String valuta){
        this.iban = iban;
        this.nume = nume;
        this.valuta = valuta;
        balanta = 0;
    }

    public double getBalanta(){
        return balanta;
    }
    public void setBalanta(double balanta){
        this.balanta = balanta;
    }
    public String getValuta(){
        return valuta;
    }
    public void depunere(double suma){
        System.out.println("metoda depunere din cont bancar");
        balanta += suma;
    }
    public void retragere(double suma){
        if (balanta<suma){
            System.out.println("Nu ai bani");
        } else {
            balanta -= suma;
        }
    }

}

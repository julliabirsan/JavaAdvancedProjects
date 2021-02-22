package ATM;

public class ContCurent extends Cont{

    private final double rataEUR = 4.9;

    public ContCurent(String iban, String valuta) {
        super.setIban(iban);
        super.setAmount(0);
        super.setValuta(valuta);
    }

    public void retragereBani(double sum, String valuta){
        if (sum>super.getAmount() || super.getAmount()<=0){
            System.out.println("Nu ai bani");
        } else if (super.getValuta().toLowerCase().equals(valuta.toLowerCase())){
            super.scadeSuma(sum);
        } else if(valuta.toUpperCase().equals("EUR")){
            super.scadeSuma(sum*rataEUR);
        }
    }
    public void depunereBani(double sum, String valuta){
        if (super.getValuta().toLowerCase().equals(valuta.toLowerCase())){
            super.adaugaSuma(sum);
        } else if(valuta.toUpperCase().equals("EUR")){
            super.adaugaSuma(sum*rataEUR);
        }
    }

}

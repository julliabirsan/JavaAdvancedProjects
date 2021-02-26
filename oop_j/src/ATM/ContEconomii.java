package ATM;

public class ContEconomii  extends Cont{
    private final double rataEur = 4.9;


    public ContEconomii(String iban, String valuta){
        super.setIban(iban);
        super.setAmount(0);
        super.setValuta(valuta);

    }
    @Override
    public void retragereBani(double suma, String valuta) throws FONDURI_INSUFICIENTE {
        if (suma > super.getAmount() || super.getAmount() <= 0) {
            throw new FONDURI_INSUFICIENTE("Fonduri Insuficiente!");
        } else {
            double comision=suma*0.5/100;

            if (super.getValuta().toLowerCase().equals(valuta.toLowerCase())) {
                super.scadeSuma(suma+comision);

            } else if (valuta.toUpperCase().equals("EUR")) {
                super.scadeSuma((suma * rataEur)+(suma*0.5)/100);
            }
        }
    }

    @Override
    public void depunereBani(double suma, String valuta) {
        if (super.getValuta().toLowerCase().equals(valuta.toLowerCase())){
            adaugaSuma(suma);
        }else if (valuta.toUpperCase().equals("EUR")){
            adaugaSuma(suma * rataEur);
        }

    }
}

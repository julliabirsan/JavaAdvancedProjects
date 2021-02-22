package demo;

public class ContCurent  extends ContBancar{
    private Card card;

    public ContCurent(long iban, String nume, String valuta) {
        super(iban, nume, valuta);
    }
    public void setCard(Card card){
        this.card=card;
    }

    public void transferIntreConturi(double suma, ContBancar contBancar){
        if (super.getBalanta()<suma){
            System.out.println("Nu ai bani");
        } else if(super.getValuta() == "RON" && contBancar.getValuta() == "RON") {
            double balanta = super.getBalanta();
            balanta-= suma;
            super.setBalanta(balanta);

            double balantaCont2 = contBancar.getBalanta()+suma;
            contBancar.depunere(balantaCont2);
        } else {
            System.out.println("Valuta nu corespunde");
        }
    }


}

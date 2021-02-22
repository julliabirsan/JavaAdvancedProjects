package banca;

public class ContEconomii extends Cont implements AppMobile{
    //daca suma este > 100 -> 3%
    //daca suma este <100 -> 1%
    public final static int comision1 = 3;
    public final static int comision2 = 1;

    @Override
    public void login(String username, String parola) {

    }

    @Override
    public void transfer(double amount, Cont cont) {
        double resultAmount;
        if (amount>100){
            resultAmount = super.getBalanta()-amount-(amount*comision1/100);
        } else {
            resultAmount = super.getBalanta()-amount-(amount*comision2/100);
        }
        super.setBalanta(resultAmount);

        double destinationAmount = cont.getBalanta() + amount;
        cont.setBalanta(destinationAmount);
    }

    @Override
    public void verificareSold(Cont cont) {
        System.out.println("Soldul este " + super.getBalanta());
    }
}

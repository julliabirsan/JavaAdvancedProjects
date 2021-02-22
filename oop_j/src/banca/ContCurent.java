package banca;

public class ContCurent extends Cont implements AppMobile, ATM{
    public static final double comision = 1;

    @Override
    public void login(String username, String parola) {

    }

    @Override
    public void transfer(double suma, Cont cont) {
        double result = super.getBalanta()-suma-(suma*comision/100);
        super.setBalanta(result);

        double destinationAmount = cont.getBalanta()+suma;
        cont.setBalanta(destinationAmount);
    }

    @Override
    public void verificareSold(Cont cont) {

        System.out.println("Soldul este " + super.getBalanta());
    }

    @Override
    public void retragere(double amount, Cont cont) {
        double finalAmount = super.getBalanta()-amount;
        super.setBalanta(finalAmount);
    }

    @Override
    public void depunere(double amount, Cont cont) {
        double finalAmount = super.getBalanta()+amount;
        super.setBalanta(finalAmount);
    }

    @Override
    public String toString() {
        return "ContCurent{}";
    }
}

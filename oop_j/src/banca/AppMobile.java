package banca;

public interface AppMobile {
    void login(String username, String parola);
    void transfer(double amount, Cont cont);
    void verificareSold(Cont cont);
}

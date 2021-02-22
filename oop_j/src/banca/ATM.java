package banca;

public interface ATM {
    void login(String card, String pin);
    void retragere(double amount, Cont cont);
    void depunere(double amount, Cont cont);
    void verificareSold(Cont cont);
}

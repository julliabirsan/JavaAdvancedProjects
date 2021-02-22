package Exceptii;

public class OperatiuniMatematice {
    public static void adunare(int x, int y) throws NegativeNumberException {
        if (x<0 || y<0){
            throw new NegativeNumberException("Numerele sunt negative");
        }
        int sum = x+y;
        System.out.println("Suma este: " + sum);
    }

    public static void scadere(int x, int y) throws NegativeNumberException {
        int scadere = x-y;
        if (scadere<0){
            throw new NegativeNumberException("Scaderea este negativa");
        }
        System.out.println("SCaderea este: " + scadere);
    }
}

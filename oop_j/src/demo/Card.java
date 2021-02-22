package demo;

public class Card {
    private long nrCard;
    private int cvv;
    private int pin;
    private String nume;

    public Card(long nrCard, int cvv, int pin, String nume){
        this.nrCard = nrCard;
        this.cvv = cvv;
        this.pin = pin;
        this.nume = nume;
    }
}

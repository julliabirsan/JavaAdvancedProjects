package demo;

public class ContEconomii  extends ContBancar{

    public ContEconomii(long iban, String nume) {
        super(iban, nume, "RON");
    }

    //la depunere, daca suma este >100 ron, primeste 0,1% dobanda
    //la depunere,daca suma este <100 ron, primeste 0,05% dobanda

    @Override
    public void depunere(double suma){
        System.out.println("metoda depunere din economii");
        double dobanda;
        if (suma>100){
            dobanda = (suma*0.1)/100;
        } else {
            dobanda = suma*0.05/100;
        }
        suma +=dobanda;
        super.setBalanta(suma);
    }


}

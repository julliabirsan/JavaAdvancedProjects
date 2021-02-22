package c9;

public class BicicletaElectrica extends Vehicul{
    @Override
    public void accelereaza() {
        super.viteza++;
        System.out.println("Bicicleta accelereaza");
    }

    @Override
    public void franeaza() {
        System.out.println("Bicicleta franeaza");
    }

    @Override
    public void schimbaViteze() {
        super.cutieViteze = super.cutieViteze + 5;
        System.out.println("Bicicleta schimba vitezele");

    }
}

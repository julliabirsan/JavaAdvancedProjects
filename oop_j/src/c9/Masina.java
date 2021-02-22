package c9;

public class Masina extends Vehicul{
    @Override
    public void accelereaza() {
        super.viteza = super.viteza + 2;
        System.out.println("Masina accelereaza");
    }

    @Override
    public void franeaza() {
        super.viteza = super.viteza-2;
        System.out.println("Masina franeaza");
    }

    @Override
    public void schimbaViteze() {

        super.cutieViteze = 2;
        System.out.println("Masina schimba vitezele");
    }
}

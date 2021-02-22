package demo;

public class Person {
    private String nume;
    private String prenume;
    private String cnp;
    private ContBancar contBancar;//relatie de agregare -> a Person has-a ContBancar

    public Person(String nume, String prenume, String cnp){
        this.nume = nume;
        this.prenume=prenume;
        this.cnp = cnp;
    }
    public void setContBancar(ContBancar contBancar){
        this.contBancar = contBancar;
    }
    public String getNumeSiPrenume(){
        return nume + " " + prenume;
    }
}

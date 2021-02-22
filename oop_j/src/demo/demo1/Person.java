package demo.demo1;

public class Person extends Object{

    private String nume;
    private String prenume;
    private String cnp;


    public Person(String nume, String cnp){
        this.nume = nume;
        this.cnp = cnp;
        System.out.println("Constructor parinte");

    }
    public Person(){

    }
    public Person(String nume){

    }


    public void setPrenume(String prenume){
        this.prenume = prenume;
    }
    public String getPrenume(){
        return prenume;
    }
    public String getNume(){
        return nume;
    }
    public String getCnp(){
        return cnp;
    }
    public void speak(String text){
        System.out.println(text);
    }
    public void speak(int x){
        System.out.println(x);
    }
    public void speak(int x, int y){}

}

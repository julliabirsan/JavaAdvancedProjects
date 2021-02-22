package c9;

public class SchimbValutar {
    public static final double rataSchimb = 4.9;

    public static void schimbDinEurInRon(double sumaDeSchimbat){
        double result = rataSchimb*sumaDeSchimbat;
        System.out.println("Suma in ron este " + result);
    }
    public static void schimbDinRonInEur(double sumaDeSchimbat){
        double result = sumaDeSchimbat/rataSchimb;
        System.out.println("Suma in eur este" + result);
    }
}

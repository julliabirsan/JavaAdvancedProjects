package Exceptii;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        List<String> listaTari = new ArrayList<>();
//        listaTari.add("Romania");
//        listaTari.add("Italia");
//        listaTari.add("Germania");
//        //citeste de la tastatura cel putin 3 caractere,
//        // si cauta mai departe String-ul in lista de tari
//        //afiseaza toate tarile ce contin acele caractere
//        Scanner in = new Scanner(System.in);
//        String cautare = in.nextLine();
//        try {
//            Operatiuni.searchWord(listaTari, cautare);
//        }catch (CuvantCautarePreaScurtException e){
//            System.out.println(e.getMessage());
//        }

        //definiti o clasa care sa implementeze operatii cu nr naturale pozitive
        //operatiile vor avea exceptii:
        //1.pentru adunare, se vor primi 2 paramterii,
        // daca unul din cei 2 parametrii este negativ,
        //se va intoarce o exceptie
        //2.pentru scadere, primul parametru va fi pozitiv, al doilea negativ
        //iar rezultatul trebuie sa fie intotdeauna>0, altfel se va arunca o exceptie
        try {
            OperatiuniMatematice.adunare(-1, 7);
        }catch (NegativeNumberException e){
            System.out.println(e.getMessage());
        }
        try {
            OperatiuniMatematice.scadere(9, 89);
        }catch (NegativeNumberException e){
            System.out.println(e.getMessage());
        }

    }
}

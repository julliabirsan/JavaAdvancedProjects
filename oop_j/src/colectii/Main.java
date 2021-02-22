package colectii;

import banca.Cont;
import banca.ContCurent;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> listaCumparaturi = new ArrayList<String>();
        //adaugare in lista
        listaCumparaturi.add("lapte");
        listaCumparaturi.add("mere");
        //printare lista
        System.out.println(listaCumparaturi);
        //dimensiune lista
        System.out.println(listaCumparaturi.size());
        listaCumparaturi.add("apa");
        listaCumparaturi.add("banane");
        System.out.println(listaCumparaturi.size());
        //citire element de pe o anumita pozitie->index
        System.out.println(listaCumparaturi.get(0));
        //inlocuire element-> set(index, nouaValoare)
        listaCumparaturi.set(0,"suc");
        System.out.println(listaCumparaturi.get(0));
        //sterg tot ce este in lista
//        listaCumparaturi.clear();
//        System.out.println(listaCumparaturi);
        //aflare index element
        System.out.println(listaCumparaturi.indexOf("mere"));
        //continut element in lista
        System.out.println(listaCumparaturi.contains("mere"));
        //stergere element
        listaCumparaturi.remove("mere");
        System.out.println(listaCumparaturi);
        //stergere element dupa index
        listaCumparaturi.remove(1);
        System.out.println(listaCumparaturi);

        for (int i=0; i<listaCumparaturi.size(); i++){
            System.out.println(listaCumparaturi.get(i));
        }
        for (String s:listaCumparaturi){
            System.out.println(s);
        }
        //lista de nr intregi
        List<Integer> listaNumereNorocoase = new ArrayList<Integer>();
        listaNumereNorocoase.add(3);
        listaNumereNorocoase.add(10);
        System.out.println(listaNumereNorocoase);

        //lista de animale - adaugati animalele preferate
        //1.afisati lista
        //2.afisati elementul de pe pozitia 2 -> get
        //3.inlocuiti primul animal cu altul si sa printati lista->set
        //4.verificati daca lista contine elementul "caine"->contains
        //5.afiseze indexul elementului "pisica"->indexOf
        //6.stergem toata lista

        //lista de nr intregi
        //sa afisam cel mai mare nr din lista
    }
}

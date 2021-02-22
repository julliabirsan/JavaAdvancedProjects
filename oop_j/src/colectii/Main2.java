package colectii;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
//        ArrayList<String> listaStrings = new ArrayList<>();
//        listaStrings.add("test");
//        listaStrings.add("test2");
//
//        for (int i=0; i<listaStrings.size(); i++){
//            System.out.println(listaStrings.get(i));
//        }
//        for (String str:listaStrings){
//            System.out.println(str);
//        }
//        Iterator<String> iterator = listaStrings.iterator();
//        while (iterator.hasNext()){
//            String str = iterator.next();
//            System.out.println(str);
//        }
//
//        List<Person> listaPersoane = new ArrayList<Person>();
//        Person p1 = new Person();
//        p1.name = "jullia";
//        p1.age = 20;
//        Person p2 = new Person();
//        p2.name = "adelina";
//        p2.age=30;
//        listaPersoane.add(p1);
//        listaPersoane.add(p2);
//        System.out.println(listaPersoane);
//        Collections.sort(listaPersoane, Person.compareByName);
//        System.out.println(listaPersoane);
//        Collections.sort(listaPersoane, Person.compareByAge);
//        System.out.println(listaPersoane);
//
//
//        //Creati 5 obiecte de tip Student, sa le adaugam in lista
//        //sa le afisam cu o iteratie
//
//        List<Integer> listaNumere = new ArrayList<Integer>();
//        listaNumere.add(5);
//        listaNumere.add(99);
//        listaNumere.add(10);
//        listaNumere.add(1);
//        System.out.println(listaNumere);
//        Collections.sort(listaNumere);
//        System.out.println(listaNumere);
//        Collections.sort(listaNumere, Collections.reverseOrder());
//        System.out.println(listaNumere);
//
//        List<String> listaNume = new ArrayList<String>();
//        listaNume.add("Jullia");
//        listaNume.add("Ana");
//        listaNume.add("Matei");
//        System.out.println(listaNume);
//        Collections.sort(listaNume);
//        System.out.println(listaNume);
//        Collections.sort(listaNume, Collections.reverseOrder());
//        System.out.println(listaNume);
//
//        HashSet<String> setNume = new HashSet<String>();
//        setNume.add("JUllia");
//        setNume.add("Adelina");
//        System.out.println(setNume);
//        setNume.add("Matei");
//        System.out.println(setNume);
//        HashSet<Integer> setNrIntregi = new HashSet<Integer>();
//        setNrIntregi.add(1);
//        setNrIntregi.add(5);
//        System.out.println(setNrIntregi);
//        HashSet<Person> setPersoane = new HashSet<>();
//        Person p1 = new Person();
//        p1.age=10;
//        p1.name="jullia";
//        Person p2 = new Person();
//        p2.age=32;
//        p2.name="adelina";
//        setPersoane.add(p1);
//        setPersoane.add(p2);
//        System.out.println(setPersoane);
//        for (Person p: setPersoane){
//            System.out.println(p);
//        }
//
//        //sa se creeze un hashset cu nume de orase
//        //sa se printeze mesajul "am gasit orasul" + numele acestuia
//        //daca elementul se afla in hashset, daca nu sa se afiseze un mesaj corespunzator
//        //sa se afiseze hashset
//        //sa se stearga toate elementele
//        HashSet<String> setNumeOrase = new HashSet<String>();
//
//        setNumeOrase.add("Bucuresti");
//        setNumeOrase.add("Constanta");
//        setNumeOrase.add("ORadea");
//        String orasCautat="Bucuresti";
//        if(setNumeOrase.contains(orasCautat)){
//            System.out.println("Am gasit orasul " + orasCautat);
//        } else {
//            System.out.println("Nu am gasit orasul");
//        }
//        for (String s : setNumeOrase){
//            if (s.equals(orasCautat)){
//                System.out.println("Am gasit orasul " + orasCautat);
//            }
//        }
//        System.out.println(setNumeOrase);
//        setNumeOrase.clear();
//        System.out.println(setNumeOrase);

        HashMap<String, String> mapUrls = new HashMap<String, String>();
        mapUrls.put("emag", "www.emag.ro");
        mapUrls.put("altex", "www.altex.ro");
        System.out.println(mapUrls);

        for(Map.Entry<String, String> map:mapUrls.entrySet()){
           System.out.println(map.getKey());
           System.out.println(map.getValue());
        }
        for (String s : mapUrls.keySet()){
            System.out.println(s);
        }
        for (String s:mapUrls.values()){
            System.out.println(s);
        }
        //sa se descrie un hashmap pt tari si capitale -> String
        //sa se printeze acesta
        //sa se citeasca de la tastatura o tara si daca exista in hashmap
        //sa se afiseze capitala acesteia
        HashMap<Integer, Person> mapPerson = new HashMap<Integer, Person>();
        Person p1 = new Person();
        p1.age=10;
        p1.name="jullia";
        Person p2 = new Person();
        p2.age=32;
        p2.name="adelina";
        mapPerson.put(1, p1);
        mapPerson.put(2, p2);
        System.out.println(mapPerson);


    }


}

import java.io.*;

public class SerializareMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        //Output - input with String
//        FileOutputStream fisier = new FileOutputStream("test.txt");
//        ObjectOutputStream out = new ObjectOutputStream(fisier);
//        out.writeObject("hello world");
//        out.flush();
//        fisier.close();
//
//        FileInputStream fis = new FileInputStream("test.txt");
//        ObjectInputStream obj = new ObjectInputStream(fis);
//        String mesaj = (String) obj.readObject();
//
//        fis.close();
//        System.out.println(mesaj);
        //Output - input with Object
        Person p = new Person("Andrei");

        FileOutputStream fisierObj = new FileOutputStream("obj.txt");
        ObjectOutputStream outObj = new ObjectOutputStream(fisierObj);
        outObj.writeObject(p);
        outObj.flush();
        fisierObj.close();

        FileInputStream fisObj = new FileInputStream("obj.txt");
        ObjectInputStream objInput = new ObjectInputStream(fisObj);
        Person p2 = (Person) objInput.readObject();

        fisierObj.close();
        System.out.println(p2.name);
    }
}

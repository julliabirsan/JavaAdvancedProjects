package ATM;

import java.util.HashMap;

public class Banca {
    public static HashMap<String, String> clienti = new HashMap<String, String>();

    public static void adaugaClient(ClientBancar clientBancar){
        clienti.put(clientBancar.getUsername(), clientBancar.getPassword());
    }

    public static boolean verificareClient(String username, String password){
        if (clienti.containsKey(username) && !clienti.get(username).equals(password)){
            System.out.println("Username-ul sau parola nu este corecta");
            return false;
        } else if (!clienti.containsKey(username)){
            System.out.println("Username-ul nu este corect sau clientul nu exista");
            return false;
        } else {
            return true;
        }
    }
}

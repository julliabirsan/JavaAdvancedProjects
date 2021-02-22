package ATM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClientBancar client1 = new ClientBancar("Popescu", "Ana", "280767656545", "anapop", "1234");
        Cont cont1 = new ContCurent("123456", "RON");
        client1.adaugaCont(cont1);

        Banca.adaugaClient(client1);
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Intoduceti username-ul si parola:");
            String username = in.nextLine();
            String password = in.nextLine();
            if (Banca.verificareClient(username, password)) {
                System.out.println("Bine ai venit la ATM");
                while(true){
                    System.out.println("Alege o optiune:");
                    System.out.println("1-Retragere");
                    System.out.println("2-Depunere");
                    System.out.println("3-Afisare sold");
                    int optiune = in.nextInt();
                    switch (optiune){
                        case 1:
                            System.out.println("Introdu suma si valuta pt retragere");
                            double sumaRetragere = in.nextDouble();
                            String valutaRetragere = in.next();
                            client1.getContList().get(0).retragereBani(sumaRetragere,valutaRetragere);
                            break;
                        case 2:
                            System.out.println("Introdu suma si valuta pt depunere");
                            double sumaDepunere = in.nextDouble();
                            String valutaDepunere = in.next();
                            client1.getContList().get(0).depunereBani(sumaDepunere,valutaDepunere);
                            break;
                        case 3:
                            System.out.println("Soldul contului este: ");
                            System.out.println(client1.getContList().get(0).getAmount() + " " +client1.getContList().get(0).getValuta());
                            break;
                        default: System.out.println("Optiune invalida");
                    }
                }
            } else {
                System.out.println("Reincearca");
            }
        }

    }
}

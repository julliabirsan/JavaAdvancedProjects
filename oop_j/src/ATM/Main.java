package ATM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FONDURI_INSUFICIENTE {
        ClientBancar client1 = new ClientBancar("Popescu", "Ana", "280767656545", "anapop", "1234");
        Cont cont1 = new ContCurent("123456", "RON");
        Cont cont2 = new ContEconomii("RON1231412", "RON");
        client1.adaugaCont(cont1);
        client1.adaugaCont(cont2);


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
                            System.out.println("Alege contul din care retragi:");
                            System.out.println("1-Cont Curent");
                            System.out.println("2-Cont Economii");
                            optiune=in.nextInt();
                            if (optiune==1){
                                System.out.println("Introdu suma si valuta pt retragere");
                                double sumaRetragere = in.nextDouble();
                                String valutaRetragere = in.next();
                                try {
                                    client1.getContList().get(0).retragereBani(sumaRetragere,valutaRetragere);
                                }catch (FONDURI_INSUFICIENTE e){
                                    System.out.println(e.getMessage());
                                }
                            }else if(optiune==2){
                                System.out.println("Introdu suma si valuta pt retragere");
                                double sumaRetragere = in.nextDouble();
                                String valutaRetragere = in.next();
                               try {
                                   client1.getContList().get(1).retragereBani(sumaRetragere,valutaRetragere);
                               }catch (FONDURI_INSUFICIENTE e){
                                   System.out.println(e.getMessage());
                               }

                            }

                            break;
                        case 2:
                            System.out.println("Alege contul in care depui:");
                            System.out.println("1-Cont Curent");
                            System.out.println("2-Cont Economii");
                            optiune=in.nextInt();
                            if (optiune==1){
                                System.out.println("Introdu suma si valuta pt depunere");
                                double sumaDepunere = in.nextDouble();
                                String valutaDepunere = in.next();
                                client1.getContList().get(0).depunereBani(sumaDepunere,valutaDepunere);

                            }else if (optiune==2){
                                System.out.println("Introdu suma si valuta pt depunere");
                                double sumaDepunere = in.nextDouble();
                                String valutaDepunere = in.next();
                                client1.getContList().get(1).depunereBani(sumaDepunere,valutaDepunere);
                            }

                            break;
                        case 3:
                            System.out.println("Soldul conturilor este: ");
                            System.out.println("Cont Curent - "+client1.getContList().get(0).getAmount() + " " +client1.getContList().get(0).getValuta());
                            System.out.println("Cont Economii - "+client1.getContList().get(1).getAmount() + " " +client1.getContList().get(0).getValuta());

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

package banca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       ContCurent contCurent1 = new ContCurent();
       contCurent1.setValuta("RON");
       contCurent1.setBalanta(100);
       contCurent1.setIban("12345678");

       ContCurent contCurent2 = new ContCurent();
       contCurent2.setValuta("RON");
       contCurent2.setBalanta(10);
       contCurent2.setIban("99245765");
//
//       System.out.println("cont1 balanta " + contCurent1.getBalanta());
//       System.out.println("cont2 balanta " +  contCurent2.getBalanta());
//       System.out.println("se face transferul.......");
//
//       contCurent1.transfer(10, contCurent2);
//
//       System.out.println("cont1 balanta " + contCurent1.getBalanta());
//       System.out.println("cont2 balanta " +  contCurent2.getBalanta());
       System.out.println("Alege optiunea dorita: 1-ATM, 2-AppMobile");
       int optiune = in.nextInt();
       if (optiune == 1){
          System.out.println("Optiunile pt ATM sunt:");
          System.out.println("1-depunere, 2-retragere, 3-verificareSold");
          int optiuneATM = in.nextInt();
          switch (optiuneATM){
             case 1: System.out.println("introdu suma pt depunere");
               double suma = in.nextDouble();
               System.out.println("suma inainte depundere " + contCurent1.getBalanta());
               contCurent1.depunere(suma, contCurent1);
               System.out.println("suma dupa depundere " + contCurent1.getBalanta());
               break;
             case 2: System.out.println("introdu suma pt retragere");
                double sumaRetragere = in.nextDouble();
                System.out.println("suma inainte retragere " + contCurent1.getBalanta());
                contCurent1.retragere(sumaRetragere, contCurent1);
                System.out.println("suma dupa retragere " + contCurent1.getBalanta());
                break;
             case 3:
                contCurent1.verificareSold(contCurent1);
                break;
             default: System.out.println("Nu este o varianta valida");
          }
       }
       if (optiune == 2){
          System.out.println("Optiunile in app mobile sunt:");
          System.out.println(" 1- transfer, 2-verificare sold");
          int optiuneApp = in.nextInt();
          switch (optiuneApp){
             case 1: System.out.println("introdu suma de transfer");
               double sumaApp = in.nextDouble();
               System.out.println("cont 1 are " + contCurent1.getBalanta());
                System.out.println("cont 2 are " + contCurent2.getBalanta());
                contCurent1.transfer(sumaApp, contCurent2);
                System.out.println("cont 1 are " + contCurent1.getBalanta());
                System.out.println("cont 2 are " + contCurent2.getBalanta());
               break;
             case 2: contCurent1.verificareSold(contCurent1);
             break;
             default:System.out.println("Optiunea aleasa nu este valida");
          }
       }
    }
}

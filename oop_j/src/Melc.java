public class Melc extends java.lang.Thread {

    private int finalDestination = 100;
    private int distance = 0;

    @Override
    public void run() {

        while (distance < finalDestination){
            int randomDistance= (int)(10.0 * Math.random());
            distance = distance + randomDistance;
            System.out.println("Melcul a parcurs -->" + distance + " -->> "+ Thread.currentThread().getId());

        }
        System.out.println("Melcul a ajuns la destinatie -->" + Thread.currentThread().getId());
    }
}

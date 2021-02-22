public class LivrareProdusPrinCurier extends A implements MagazinOnline, Livratorul{
    @Override
    public void livrare() {
        System.out.println("se face livrarea produsului");
    }

    @Override
    public void predaColet() {
        System.out.println("am predat colet");
    }
    @Override
    public void sunaInainteDePredare() {
        System.out.println("am sunat inainte de a preda coletul");

    }
}

package src.abstractfactory.lojaimoveis;


public class Client {

    public static void main(String[] args) {
        AbstractFactory familyArtDeco = new ArtDecoFactory();

        System.out.println("Art Deco: ");
        System.out.println("Chair: " + familyArtDeco.createChair());
        System.out.println("Sofa: " + familyArtDeco.createSofa());
        System.out.println("CoffeTable: " + familyArtDeco.createCoffeTable());
    }

}

package src.abstractfactory.lojaimoveis;

import src.abstractfactory.lojaimoveis.model.*;

public class ArtDecoFactory implements AbstractFactory {

    @Override
    public Chair createChair() {
        return new ChairArtDeco();
    }

    @Override
    public Sofa createSofa() {
        return new SofaArtDeco();
    }

    @Override
    public CoffeTable createCoffeTable() {
        return new CoffeTableArtDeco();
    }

}

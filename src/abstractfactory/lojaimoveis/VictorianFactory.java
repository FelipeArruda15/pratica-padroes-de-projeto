package src.abstractfactory.lojaimoveis;

import src.abstractfactory.lojaimoveis.model.*;

public class VictorianFactory implements AbstractFactory {
    
    @Override
    public Chair createChair() {
        return new ChairVictorian();
    }

    @Override
    public Sofa createSofa() {
        return new SofaVictorian();
    }

    @Override
    public CoffeTable createCoffeTable() {
        return new CoffeTableVictorian();
    }

}

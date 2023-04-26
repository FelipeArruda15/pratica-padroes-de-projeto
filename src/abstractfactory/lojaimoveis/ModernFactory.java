package src.abstractfactory.lojaimoveis;

import src.abstractfactory.lojaimoveis.model.*;

public class ModernFactory implements AbstractFactory {
    
    @Override
    public Chair createChair() {
        return new ChairModern();
    }

    @Override
    public Sofa createSofa() {
        return new SofaModern();
    }

    @Override
    public CoffeTable createCoffeTable() {
        return new CoffeTableModern();
    }

}

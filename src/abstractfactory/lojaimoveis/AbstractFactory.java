package src.abstractfactory.lojaimoveis;

import src.abstractfactory.lojaimoveis.model.Chair;
import src.abstractfactory.lojaimoveis.model.CoffeTable;
import src.abstractfactory.lojaimoveis.model.Sofa;

public interface AbstractFactory {
    
    Chair createChair();

    Sofa createSofa();

    CoffeTable createCoffeTable();

}

package src.abstractfactory.lojaimoveis.model;

public class CoffeTableModern implements CoffeTable {
    
    @Override
    public boolean isMadeOfGlass() {
        return true;
    }

    @Override
    public Integer getQuantitySeats() {
        return 4;
    }

}

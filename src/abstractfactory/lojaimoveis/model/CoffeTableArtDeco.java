package src.abstractfactory.lojaimoveis.model;

public class CoffeTableArtDeco implements CoffeTable {
    
    @Override
    public boolean isMadeOfGlass() {
        return false;
    }

    @Override
    public Integer getQuantitySeats() {
        return 2;
    }

}

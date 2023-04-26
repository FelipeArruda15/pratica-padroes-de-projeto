package src.abstractfactory.lojaimoveis.model;

public class CoffeTableVictorian implements CoffeTable {

    @Override
    public boolean isMadeOfGlass() {
        return true;
    }

    @Override
    public Integer getQuantitySeats() {
        return 3;
    }

}

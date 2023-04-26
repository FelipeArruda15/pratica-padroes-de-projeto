package src.abstractfactory.lojaimoveis.model;

public class ChairVictorian implements Chair {

    @Override
    public boolean hasBackrest() {
        return true;
    }

    @Override
    public boolean hasLegs() {
        return true;
    }
    
}

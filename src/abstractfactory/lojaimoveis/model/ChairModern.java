package src.abstractfactory.lojaimoveis.model;

public class ChairModern implements Chair {
    
    @Override
    public boolean hasBackrest() {
        return true;
    }

    @Override
    public boolean hasLegs() {
        return false;
    }

}

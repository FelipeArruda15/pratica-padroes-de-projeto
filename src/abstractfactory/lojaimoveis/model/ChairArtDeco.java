package src.abstractfactory.lojaimoveis.model;

public class ChairArtDeco implements Chair {

    @Override
    public boolean hasBackrest() {
        return false;
    }

    @Override
    public boolean hasLegs() {
        return true;
    }

}
package src.abstractfactory.lojaimoveis.model;

public class SofaVictorian implements Sofa {

    @Override
    public boolean isSofaBed() {
        return false;
    }

    @Override
    public boolean hasArm() {
        return true;
    }
    
}

package src.abstractfactory.lojaimoveis.model;

public class SofaModern implements Sofa {
    
    @Override
    public boolean isSofaBed() {
        return false;
    }

    @Override
    public boolean hasArm() {
        return false;
    }

}

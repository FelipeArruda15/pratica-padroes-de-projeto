package src.abstractfactory.lojaimoveis.model;

public class SofaArtDeco implements Sofa {
    
    @Override
    public boolean isSofaBed() {
        return true;
    }

    @Override
    public boolean hasArm() {
        return true;
    }

}

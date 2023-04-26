package src.factory.model;

public class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("Entrega por mar em um contêiner");
    }
}

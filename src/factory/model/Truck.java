package src.factory.model;

public class Truck implements Transport {

    @Override
    public void deliver() {
        System.out.println("Entrega por via terrestre em caixa");
    }
}

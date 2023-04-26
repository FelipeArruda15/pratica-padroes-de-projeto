package src.factory.factory;

import src.factory.model.Transport;

public abstract class Logistics {

    public void planDelivery(){
        System.out.println("Plano de entrega: ");
        System.out.println("1 - Coleta");
        System.out.println("2 - Etiquetação");
        System.out.println("3 - Saida para entrega ");
        createTransport().deliver();
    }

    public abstract Transport createTransport();

}

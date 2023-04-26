package src.factory;

import src.factory.factory.Logistics;
import src.factory.factory.RoadLogistics;
import src.factory.factory.SeaLogistics;
import src.factory.model.Transport;

public class Client {

    public static void main(String[] args) {

        //Terrestre
        Logistics roadLogistics = new RoadLogistics();
        roadLogistics.planDelivery();

        System.out.println("----------------------------");

        //Mar
        Logistics seaLogistics = new SeaLogistics();
        seaLogistics.planDelivery();

    }
}

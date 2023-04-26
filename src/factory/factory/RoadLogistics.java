package src.factory.factory;

import src.factory.model.Transport;
import src.factory.model.Truck;

public class RoadLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}

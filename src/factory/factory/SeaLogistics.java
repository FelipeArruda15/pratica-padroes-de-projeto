package src.factory.factory;

import src.factory.model.Ship;
import src.factory.model.Transport;

public class SeaLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}

package src.abstractfactory.servicos.abstractfactory;

import src.abstractfactory.servicos.services.CarEJBService;
import src.abstractfactory.servicos.services.CarRestApiService;
import src.abstractfactory.servicos.services.Service;

public class CarEntityServiceFactory implements EntityServiceAbstractFacory {

    @Override
    public Service getRestApiService() {
        return new CarRestApiService();
    }

    @Override
    public Service getEJBService() {
        return new CarEJBService();
    }

}

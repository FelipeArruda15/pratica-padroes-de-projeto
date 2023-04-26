package src.abstractfactory.servicos.abstractfactory;

import src.abstractfactory.servicos.services.Service;
import src.abstractfactory.servicos.services.UserEJBService;
import src.abstractfactory.servicos.services.UserRestApiService;

public class UserEntityServiceFactory implements EntityServiceAbstractFacory {

    @Override
    public Service getRestApiService() {
        return new UserRestApiService();
    }

    @Override
    public Service getEJBService() {
        return new UserEJBService();
    }

}

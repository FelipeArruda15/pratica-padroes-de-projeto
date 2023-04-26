package src.abstractfactory.servicos.abstractfactory;

import src.abstractfactory.servicos.services.Service;

public interface EntityServiceAbstractFacory {

    Service getRestApiService();
    Service getEJBService();

}

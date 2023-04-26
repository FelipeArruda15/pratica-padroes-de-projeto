package src.abstractfactory.servicos;

import src.abstractfactory.servicos.abstractfactory.CarEntityServiceFactory;
import src.abstractfactory.servicos.abstractfactory.EntityServiceAbstractFacory;
import src.abstractfactory.servicos.abstractfactory.UserEntityServiceFactory;

public class Client {

    public static void main(String[] args) {
        EntityServiceAbstractFacory userFactory = new UserEntityServiceFactory();
        userFactory.getEJBService().save("Felipe");

        EntityServiceAbstractFacory carFactory = new CarEntityServiceFactory();
        carFactory.getRestApiService().update("BMW 320I");

    }

}

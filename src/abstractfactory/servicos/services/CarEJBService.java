package src.abstractfactory.servicos.services;

public class CarEJBService implements Service {


    @Override
    public void save(String model) {
        System.out.println("Salvando " + model + " carro através da interface do EJB");
    }

    @Override
    public void update(String newModel) {
        System.out.println("Atualizando " + newModel + " carro através da interface do EJB");
    }
}

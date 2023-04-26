package src.abstractfactory.servicos.services;

public class CarRestApiService implements Service {

    @Override
    public void save(String model) {
        System.out.println("Salvando " + model + " carro através da interface do Rest");
    }

    @Override
    public void update(String newModel) {
        System.out.println("Atualizando " + newModel + " carro através da interface do Rest");
    }

}

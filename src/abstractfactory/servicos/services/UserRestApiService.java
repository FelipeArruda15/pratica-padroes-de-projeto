package src.abstractfactory.servicos.services;

public class UserRestApiService implements Service {

    @Override
    public void save(String model) {
        System.out.println("Salvando " + model + " usuário através da interface do Rest");
    }

    @Override
    public void update(String newModel) {
        System.out.println("Atualizando o usuário " + newModel + " através da interface do Rest");
    }
}

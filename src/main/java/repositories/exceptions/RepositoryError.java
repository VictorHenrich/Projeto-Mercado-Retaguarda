package repositories.exceptions;

import repositories.patterns.CrudRepository;


public class RepositoryError extends Exception{
    public RepositoryError(
            CrudRepository objectRepository,
            ModulesRepositoy module,
            Exception error
    ){
        super(
                "Falha ao utilizar o módulo de " + module
                + " na classe: " + objectRepository.getClass().getName()
                + "\nError Message: " + error.getMessage()
        );
    }
}

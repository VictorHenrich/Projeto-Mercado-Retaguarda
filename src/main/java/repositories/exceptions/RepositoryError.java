package repositories.exceptions;

import repositories.patterns.ICrudRepository;


public class RepositoryError extends Exception{
    public RepositoryError(
            ICrudRepository objectRepository,
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

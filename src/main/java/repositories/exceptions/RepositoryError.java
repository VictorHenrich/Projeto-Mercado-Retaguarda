package repositories.exceptions;

public class RepositoryError extends Exception{
    public RepositoryError(String module, Exception error){
        super(
                "Falha ao utilizar o módulo de " +
                module + "\nERROR: " + error.getMessage()
        );
    }
}

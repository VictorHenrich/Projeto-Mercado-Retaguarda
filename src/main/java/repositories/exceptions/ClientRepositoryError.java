package repositories.exceptions;

public class ClientRepositoryError extends RepositoryError{
    public ClientRepositoryError(String module, Exception error) {
        super(module, error);
    }
}

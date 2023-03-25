package repositories.exceptions;

public class ClassRepositoryError extends RepositoryError{
    public ClassRepositoryError(String module, Exception error) {
        super(module, error);
    }
}

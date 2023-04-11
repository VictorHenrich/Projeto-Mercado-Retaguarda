package repositories.exceptions;

public class CollaboratorRepositoryError extends RepositoryError{
    public CollaboratorRepositoryError(String module, Exception error) {
        super(module, error);
    }
}

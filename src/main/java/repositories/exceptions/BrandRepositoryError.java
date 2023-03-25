package repositories.exceptions;

public class BrandRepositoryError extends RepositoryError{
    public BrandRepositoryError(String module, Exception error) {
        super(module, error);
    }
}

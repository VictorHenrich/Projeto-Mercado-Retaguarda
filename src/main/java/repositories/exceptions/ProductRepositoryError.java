package repositories.exceptions;

public class ProductRepositoryError extends RepositoryError{
    public ProductRepositoryError(String module, Exception error) {
        super(module, error);
    }
}

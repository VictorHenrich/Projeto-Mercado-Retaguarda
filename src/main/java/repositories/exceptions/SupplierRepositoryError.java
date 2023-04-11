package repositories.exceptions;

public class SupplierRepositoryError extends RepositoryError{
    public SupplierRepositoryError(String module, Exception error) {
        super(module, error);
    }
}

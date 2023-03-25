package repositories.exceptions;

public class AddressRepositoryError extends RepositoryError{

    public AddressRepositoryError(String module, Exception error) {
        super(module, error);
    }
}

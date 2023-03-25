package repositories.exceptions;

public class DistrictRepositoryError extends RepositoryError{

    public DistrictRepositoryError(String module, Exception error) {
        super(module, error);
    }
}

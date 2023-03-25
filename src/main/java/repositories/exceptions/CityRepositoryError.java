package repositories.exceptions;

public class CityRepositoryError extends Exception{
    public CityRepositoryError(String module, Exception error){
        super(module, error);
    }
}

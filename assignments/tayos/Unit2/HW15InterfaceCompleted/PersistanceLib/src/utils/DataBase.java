package utils;

/**
 *
 * @author Sebas
 */
public interface DataBase extends DataPersistance{
    public void openConnection(String connectionString);
    public void closeConnection();
    public String generateConnection(String user, String password, String database);
}
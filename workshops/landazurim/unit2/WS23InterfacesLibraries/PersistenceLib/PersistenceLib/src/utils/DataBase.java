
package utils;

/**
 *
 * @author Mateo Landazuri OOP
 */
public interface DataBase extends DataPersistence{
    public void openConnection(String connectionString);
    public void closeConnection();
    public String generateConnection(String user, String password, String dataBase);
    
    
}


package utils;

/**
 *
 * @author GUITARRA JHON
 */
public interface DataBse extends DataPersistence{
    public void openConnectionString(String connectionString);
    public void closeConnection();
    public void generationConnectString(String user,String password, String dataBase);
}

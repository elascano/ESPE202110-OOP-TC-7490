
package ec.edu.espe.cbook.model;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author JOSE SANCHEZ
 */
public class Conecction {
    
          ConnectionString connectionString = new ConnectionString("mongodb+srv://jfsanchez15:jfsanchez15@cluster0.pvcrw.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        MongoClientSettings settings = MongoClientSettings.builder()
         .applyConnectionString(connectionString)
          .build();
        MongoClient mongoClient = MongoClients.create(settings);
        MongoDatabase database = mongoClient.getDatabase("Warehouse");

    
    
    public MongoDatabase obtenerDB(){
        return database;
    }

}

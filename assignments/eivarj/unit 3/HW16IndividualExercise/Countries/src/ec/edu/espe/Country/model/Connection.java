
package ec.edu.espe.Country.model;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author EivarJaime
 */
public class Connection {
    


ConnectionString connectionString = new ConnectionString("mongodb+srv://jmeivar:jmeivar@cluster0.rac7v.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(connectionString)
        .build();
MongoClient mongoClient = MongoClients.create(settings);
MongoDatabase database = mongoClient.getDatabase("Country");


    
    public MongoDatabase obtenerDB(){
        return database;
    }

}
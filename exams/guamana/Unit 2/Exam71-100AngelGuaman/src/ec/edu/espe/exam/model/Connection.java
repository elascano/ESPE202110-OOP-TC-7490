
package ec.edu.espe.exam.model;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Angel Guaman
 */
public class Connection {
    

ConnectionString connectionString = new ConnectionString("mongodb+srv://guitarra155:guitarra155@cluster0oop.dv0as.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(connectionString)
        .build();
MongoClient mongoClient = MongoClients.create(settings);
MongoDatabase database = mongoClient.getDatabase("Examen2");

    public MongoDatabase obtenerDB(){
        return database;
    }

}

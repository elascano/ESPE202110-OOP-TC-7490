
package utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author mayer
 */
public class DBConnection {
ConnectionString connectionString = new ConnectionString("mongodb+srv://PSBM:1751375971@cluster0.9shff.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(connectionString)
        .build();
MongoClient mongoClient = MongoClients.create(settings);
MongoDatabase database = mongoClient.getDatabase("RegisterFinal");

    public MongoDatabase obtenerDB(){
        return database;
    }
  
}
package utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Melanie 
 */
public class MongoConnection {
    
        ConnectionString connectionString = new ConnectionString("mongodb+srv://NoLeaderTeam:Leader2022@clusternoleaderteam.uttuy.mongodb.net/ComputerData?retryWrites=true&w=majority");
        MongoClientSettings settings = MongoClientSettings.builder()
         .applyConnectionString(connectionString)
          .build();
        MongoClient mongoClient = MongoClients.create(settings);
        MongoDatabase database = mongoClient.getDatabase("ComputersData");

    
    
    public MongoDatabase obtenerDB(){
        return database;
    }

}
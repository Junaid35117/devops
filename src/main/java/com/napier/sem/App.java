package com.napier.sem;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class App
{
    public static void main(String[] args)
    {
        // Get MongoDB host from environment variable or use default
        String mongoHost = System.getenv("MONGODB_HOST");
        if (mongoHost == null || mongoHost.isEmpty()) {
            mongoHost = "mongo-dbserver"; // default for Docker Compose
        }

        System.out.println("Connecting to MongoDB at: " + mongoHost + ":27017");

        // Connect to MongoDB - configurable host
        MongoClient mongoClient = new MongoClient(mongoHost, 27017);

        // Get a database - will create when we use it
        MongoDatabase database = mongoClient.getDatabase("mydb");
        // Get a collection from the database
        MongoCollection<Document> collection = database.getCollection("test");
        // Create a document to store
        Document doc = new Document("name", "Kevin Sim")
                .append("class", "DevOps")
                .append("year", "2024")
                .append("result", new Document("CW", 95).append("EX", 85));
        // Add document to collection
        collection.insertOne(doc);

        // Check document in collection
        Document myDoc = collection.find().first();
        System.out.println(myDoc.toJson());

        // Close the connection
        mongoClient.close();
    }
}
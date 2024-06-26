import Connections.MongoDBConnection;
import InputControl.InputControl;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

public class Main {

    public static void main(String[] args) {
        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
        String nameStore = InputControl.readString("Indicate the name of the flower shop");
        MongoDBConnection mongoDBConnection = new MongoDBConnection( nameStore, mongoClient);

        Demo demo = new Demo(mongoDBConnection);
        demo.run();

    }
}
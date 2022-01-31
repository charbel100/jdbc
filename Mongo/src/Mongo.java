import com.mongodb.DB;
import com.mongodb.MongoClient;


public class Mongo{

    public static void main(String[] args)throws Exception{

        try{
            MongoClient mongoClient = new MongoClient("localhost" ,27017);
            DB db = mongoClient.getDB("test");
            System.out.println("Connected to Database");

        }catch(Exception e)
        {
            System.out.println(e);

        }

        System.out.println("Server is ready");

    }

}
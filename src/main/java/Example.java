
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import javax.json.*;
import java.io.FileInputStream;
import java.io.InputStream;



public class Example {

    public static void main(String[] args) throws Exception {
        InputStream fis = new FileInputStream("C:\\Users\\jeppe\\myConfluenceMacro\\TestingGson\\src\\main\\resources\\schema.json");
        //creates object
        JsonReader reader = Json.createReader(fis);

        JsonObject personObject = reader.readObject();
        reader.close();

       // System.out.println("id   : " + personObject.getJsonObject("batters"));
       // System.out.println("id   : " + personObject.getString("type" ));
      //  System.out.println("id   : " + personObject.getJsonArray("topping"));
       // System.out.println("id   : " + personObject.getJsonArray("topping").get(1));
        //System.out.println("id   : " + personObject.getJsonObject("batters").getJsonArray("batter").get(2));
      //  System.out.println("id   : " + personObject.getJsonObject("batters").getJsonArray("batter").get(0));
        System.out.println("id   : " + personObject.getJsonObject("batters").getJsonArray("batter").get(0));

    }
}

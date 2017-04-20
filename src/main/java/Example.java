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
        System.out.println("id   : " + personObject.getString("Id"));
    }
}

package FileReadWrite;

import com.github.cliftonlabs.json_simple.JsonObject;
import netscape.javascript.JSObject;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.put("ID","1");
        jsonObject.put("First Name","Dharani");
        try {
            FileWriter file = new FileWriter("X:/output.json");
            file.write(jsonObject.toJson());
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(jsonObject);
    }
}

package oop.assignment3.ex44;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import oop.assignment3.ex42.Parser;

import java.io.*;


public class JSONParser {

    // Products object with an array of three products (they are strings)
    // json.parse converts text into a javascript object
        // when using json.parse on a json derived from an array, it returns a
        //      javascript array

    // json object literals contain key/value pairs separated by a colon
    // you can create a javascript object from a json object literal
    //      Normally, you create a JavaScript object by parsing a JSON string:
    //      you can access object values by using dot(.) notation
            // const myJSON = '{"name":"John", "age":30, "car":null}';
            //const myObj = JSON.parse(myJSON);
            //x = myObj.name;   OR   x = myObj["name"]

    // You can create a JavaScript array by parsing a JSON string:
        // myJSON = '["Ford", "BMW", "Fiat"]';
        //myArray = JSON.Parse(myJSON);
            // access array values by index
            // myArray[0];

    public void jsonReader(String productName) throws IOException {
        File input = new File("exercise44_input.json");
        JsonElement fileElement = JsonParser.parseReader(new FileReader(input));
        JsonObject fileObject = fileElement.getAsJsonObject();

        // process all products
        JsonArray jsonArrayOfProducts = fileObject.get("products").getAsJsonArray();
        for (JsonElement productElement : jsonArrayOfProducts) {
            // Get the Json object:
            JsonObject productJsonObject = productElement.getAsJsonObject();

            // Extract data
            String product = productJsonObject.get("name").getAsString();

            if (productName.equals(product)) {
                Double price = productJsonObject.get("price").getAsDouble();
                Integer quantity = productJsonObject.get("quantity").getAsInt();

                System.out.printf("Name: %s\nPrice: %.2f\nQuantity: %d\n", product, price, quantity);
            }
        }
    }

}

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex44;

import com.google.gson.*;
import java.io.*;

public class JSONParser {

    public String jsonReader(String productName)  {
        JSONParser jp = new JSONParser();
        File input = new File("exercise44_input.json");

        // Unsure that it is a valid file
        try(FileReader fr = new FileReader(input)) {
            JsonElement fileElement = JsonParser.parseReader(fr);
            JsonObject fileObject = fileElement.getAsJsonObject();

            // process all products
            JsonArray jsonArrayOfProducts = fileObject.get("products").getAsJsonArray();
            for (JsonElement productElement : jsonArrayOfProducts) {
                // Get the Json object:
                JsonObject productJsonObject = productElement.getAsJsonObject();

                // Extract data
                String product = productJsonObject.get("name").getAsString();

                // See if the user entered a valid name
                if (productName.equalsIgnoreCase(product)){
                    return jp.ifEqual(product, productJsonObject);
                }
            }

            return jp.notEqual();

        } catch(IOException e) {
            System.out.print("invalid");
        }

        return null;
    }

    public Double getProductPrice(JsonObject productJsonObject) {
        return productJsonObject.get("price").getAsDouble();
    }

    public Integer getProductQuantity(JsonObject productJsonObject) {
        return productJsonObject.get("quantity").getAsInt();
    }


    public String ifEqual(String productName, JsonObject productJsonObject) {
        JSONParser jp = new JSONParser();
        String output = String.format("Name: %s\n", productName);

        output += String.format("Price: %.2f\n", jp.getProductPrice(productJsonObject));
        output += String.format("Quantity: %d", jp.getProductQuantity(productJsonObject));

        return output;
    }

    public String notEqual() {
        return "Sorry, that product was not found in our inventory.\n";
    }
}

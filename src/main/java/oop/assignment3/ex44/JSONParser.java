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

        // If the file is valid
        try(FileReader fr = new FileReader(input)) {

            // Create a new JsonObject
            JsonElement fileElement = JsonParser.parseReader(fr);
            JsonObject fileObject = fileElement.getAsJsonObject();

            // Process all the elements in the JsonFile
            JsonArray jsonArrayOfProducts = fileObject.get("products").getAsJsonArray();

            // For every object in the json array
            for (JsonElement productElement : jsonArrayOfProducts) {

                // Get the Json object:
                JsonObject productJsonObject = productElement.getAsJsonObject();

                // Extract data
                String product = productJsonObject.get("name").getAsString();

                // See if the user entered a valid name
                if (productName.equalsIgnoreCase(product)){

                    // Return the output if it was equal
                    return jp.ifEqual(product, productJsonObject);
                }
            }

            // Tell the user that there was nothing equal to their object
            return jp.notEqual();
        } catch(IOException e) {

            // Otherwise, tell the user that their file is invalid
            System.out.print("invalid");
        }

        return null;
    }

    public Double getProductPrice(JsonObject productJsonObject) {

        // Determine the price
        return productJsonObject.get("price").getAsDouble();
    }

    public Integer getProductQuantity(JsonObject productJsonObject) {

        // Determine the quantity
        return productJsonObject.get("quantity").getAsInt();
    }


    public String ifEqual(String productName, JsonObject productJsonObject) {
        JSONParser jp = new JSONParser();

        // Output the name, price, and quantity if it was found in the json array
        String output = String.format("Name: %s\n", productName);

        output += String.format("Price: %.2f\n", jp.getProductPrice(productJsonObject));
        output += String.format("Quantity: %d", jp.getProductQuantity(productJsonObject));

        return output;
    }

    public String notEqual() {
        // Product was not found
        return "Sorry, that product was not found in our inventory.\n";
    }
}

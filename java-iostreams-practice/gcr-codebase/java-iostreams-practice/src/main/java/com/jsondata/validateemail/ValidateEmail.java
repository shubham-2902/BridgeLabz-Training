package com.jsondata.validateemail;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.*;
import java.io.InputStream;
import java.util.Set;

public class ValidateEmail {

    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            InputStream jsonStream = ValidateEmail.class.getClassLoader()
                    .getResourceAsStream("Sample.json");

            String schemaStr =
                    "{"
                  + "\"type\":\"object\","
                  + "\"properties\":{"
                  + "  \"name\":{\"type\":\"string\"},"
                  + "  \"email\":{\"type\":\"string\",\"format\":\"email\"}"
                  + "},"
                  + "\"required\":[\"email\"]"
                  + "}";

            JsonSchemaFactory factory = JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V7);
            JsonSchema schema = factory.getSchema(schemaStr);

            Set<ValidationMessage> errors = schema.validate(mapper.readTree(jsonStream));

            if (errors.isEmpty()) {
                System.out.println("Email is valid!");
            } else {
                System.out.println("Invalid email format:");
                errors.forEach(System.out::println);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

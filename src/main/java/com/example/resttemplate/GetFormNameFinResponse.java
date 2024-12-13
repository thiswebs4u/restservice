package com.example.resttemplate;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class GetFormNameFinResponse {
    public static void main(String[] args) {
        // Base URL of the API endpoint
        String baseUrl = "http://example.com/api/check";

        // Query parameters
        String param1 = "value1";
        String param2 = "value2";

        // Build the URL with query parameters
        String url = UriComponentsBuilder.fromHttpUrl(baseUrl)
                .queryParam("param1", param1)
                .queryParam("param2", param2)
                .toUriString();

        // Create a RestTemplate instance
        RestTemplate restTemplate = new RestTemplate();

        try {
            // Make the GET request and receive a Boolean response
            Boolean response = restTemplate.getForObject(url, Boolean.class);

            // Print the response
            System.out.println("Response: " + response);
        } catch (Exception e) {
            // Handle exceptions (e.g., connection issues, invalid responses)
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}
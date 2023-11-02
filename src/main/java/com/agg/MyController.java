package com.agg;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MyController {
    @PostMapping("/submitData")
    public ResponseEntity<String> submitData(@RequestBody Map<String, Object> data) {
        // Handle data from the client (JavaScript) and process it
        // You can access the submitted data using the "data" parameter

        // Respond with data, usually in JSON format
        Map<String, String> response = new HashMap<>();
        response.put("message", "Data received successfully");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}

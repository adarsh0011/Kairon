package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;

@Document(collection = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private String id;  // MongoDB will automatically generate this ID
    private String username;
    private String password;
    private String role;  // Role can be 'USER' or 'ADMIN'
}

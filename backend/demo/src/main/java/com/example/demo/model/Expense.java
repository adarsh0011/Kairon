package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;
import java.time.LocalDateTime;

@Document(collection = "expenses")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Expense {
    @Id
    private String id;  // MongoDB will auto-generate this ID
    private String userId; // Reference to User (stored as user ID)
    private String title;  // Title of the expense
    private double amount;  // Amount of the expense
    private LocalDateTime createdAt = LocalDateTime.now();  // Timestamp of creation
}

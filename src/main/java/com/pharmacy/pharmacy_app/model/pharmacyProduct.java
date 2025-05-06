package com.pharmacy.pharmacy_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor

public class pharmacyProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @NonNull
    @NotBlank(message = "Name is required ")
    private String name;

    @NonNull
    @NotBlank(message  = "Quantity is required")
    private int quantity;

    @NonNull
    @NotBlank(message  = "Price is required")
    private double price;

    private String description;



}

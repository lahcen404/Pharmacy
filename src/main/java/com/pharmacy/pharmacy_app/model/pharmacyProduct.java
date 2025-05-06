package com.pharmacy.pharmacy_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class pharmacyProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @NotBlank(message = "Name is required ")
    private String name;

    @NotBlank(message  = "Quantity is required")
    private int quantity;

    @NotBlank(message  = "Price is required")
    private double price;

    private String description;


    //getters & setters

}

package com.pharmacy.pharmacy_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
//@Getter
//@Setter

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor

public class PharmacyProduct {
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


    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
}

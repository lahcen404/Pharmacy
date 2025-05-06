package com.pharmacy.pharmacy_app.repository;

import com.pharmacy.pharmacy_app.model.pharmacyProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PharmacyProductRepository extends JpaRepository<pharmacyProduct, Long> {
}

package com.pharmacy.pharmacy_app.service;


import com.pharmacy.pharmacy_app.model.pharmacyProduct;
import com.pharmacy.pharmacy_app.repository.PharmacyProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class pharmacyProductService {

    private final PharmacyProductRepository pharmacyProductRepository;

    @Autowired
    public pharmacyProductService(PharmacyProductRepository pharmacyProductRepository) {
        this.pharmacyProductRepository = pharmacyProductRepository;
    }

    public List<pharmacyProduct> getAllProducts() {
        return pharmacyProductRepository.findAll();
    }

    public Optional<pharmacyProduct> getProductById(Long id) {
        return pharmacyProductRepository.findById(id);
    }

    public pharmacyProduct createProduct(pharmacyProduct product) {
        return pharmacyProductRepository.save(product);
    }

    public void deleteProduct(Long id) {
        pharmacyProductRepository.deleteById(id);
    }

    public pharmacyProduct updateProduct(Long id, pharmacyProduct productDetails) {
        pharmacyProduct product = pharmacyProductRepository.findById(id).orElseThrow();
        product.setName(productDetails.getName());
        product.setPrice(productDetails.getPrice());
        product.setQuantity(productDetails.getQuantity());
        product.setDescription(productDetails.getDescription());

        return pharmacyProductRepository.save(product);

    }

}

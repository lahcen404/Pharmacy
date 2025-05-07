package com.pharmacy.pharmacy_app.controller;

import com.pharmacy.pharmacy_app.model.PharmacyProduct;
import com.pharmacy.pharmacy_app.repository.PharmacyProductRepository;
import com.pharmacy.pharmacy_app.service.PharmacyProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")

public class PharmacyProductController {


    private final PharmacyProductService pharmacyProductService;

    @Autowired
    public PharmacyProductController( PharmacyProductService pharmacyProductService) {

        this.pharmacyProductService = pharmacyProductService;
    }

    @GetMapping
    public List<PharmacyProduct> getAllProducts(){
        return pharmacyProductService.getAllProducts();
    }

    @GetMapping("/{id}")
    public PharmacyProduct getProductById(@PathVariable Long id){
        return pharmacyProductService.getProductById(id).orElseThrow();
    }

    @PostMapping
    public PharmacyProduct createProduct(@RequestBody PharmacyProduct product){
        return pharmacyProductService.createProduct(product);
    }

    @PutMapping("/{id}")
    public PharmacyProduct updateProduct(@PathVariable Long id, @RequestBody PharmacyProduct product) {
        return pharmacyProductService.updateProduct(id,product);
    }




}

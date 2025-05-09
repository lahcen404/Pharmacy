package com.pharmacy.pharmacy_app.service;


import com.pharmacy.pharmacy_app.dto.ProductDTO;
import com.pharmacy.pharmacy_app.mapper.ProductDTOMapper;
import com.pharmacy.pharmacy_app.model.PharmacyProduct;

import com.pharmacy.pharmacy_app.repository.PharmacyProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

@Service
public class PharmacyProductService {

    private final PharmacyProductRepository pharmacyProductRepository;
    private final ProductDTOMapper productDTOMapper;

    @Autowired
    public PharmacyProductService(PharmacyProductRepository pharmacyProductRepository, ProductDTOMapper productDTOMapper) {
        this.pharmacyProductRepository = pharmacyProductRepository;
        this.productDTOMapper = productDTOMapper;

    }

    public List<ProductDTO> getAllProducts() {
        return pharmacyProductRepository.findAll()
        .stream()
        .map( productDTOMapper )
                .collect(Collectors.toList());
    }

    public Optional<PharmacyProduct> getProductById(Long id) {
        return pharmacyProductRepository.findById(id);
    }

    public PharmacyProduct createProduct(PharmacyProduct product) {
        return pharmacyProductRepository.save(product);
    }

    public void deleteProduct(Long id) {
        pharmacyProductRepository.deleteById(id);
    }




    public PharmacyProduct updateProduct(Long id, PharmacyProduct productDetails) {
        PharmacyProduct product = pharmacyProductRepository.findById(id).orElseThrow();
        product.setName(productDetails.getName());
        product.setPrice(productDetails.getPrice());
        product.setQuantity(productDetails.getQuantity());
        product.setDescription(productDetails.getDescription());

        return pharmacyProductRepository.save(product);

    }

}

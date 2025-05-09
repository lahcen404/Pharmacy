package com.pharmacy.pharmacy_app.mapper;

import com.pharmacy.pharmacy_app.dto.ProductDTO;
import com.pharmacy.pharmacy_app.model.PharmacyProduct;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class ProductDTOMapper implements Function<PharmacyProduct, ProductDTO> {
    @Override
    public ProductDTO apply(PharmacyProduct product) {
        return new ProductDTO(
                product.getName(),
                product.getPrice()
        );
    }
}

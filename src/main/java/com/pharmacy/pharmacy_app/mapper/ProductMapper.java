package com.pharmacy.pharmacy_app.mapper;

import com.pharmacy.pharmacy_app.dto.ProductDTO;
import com.pharmacy.pharmacy_app.model.PharmacyProduct;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
  PharmacyProduct toEntity(ProductDTO productDTO);
  ProductDTO toDTO(PharmacyProduct product);

}

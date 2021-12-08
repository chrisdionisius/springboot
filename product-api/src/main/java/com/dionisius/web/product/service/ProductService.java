package com.dionisius.web.product.service;

import com.dionisius.web.product.dto.input.ProductInput;
import com.dionisius.web.product.dto.output.ProductOutput;

import java.util.List;

public interface ProductService {
    ProductOutput getOne(Long id);
    List<ProductOutput> getAll();
    void addOne(ProductInput productInput);
}

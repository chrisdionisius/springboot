package com.dionisius.web.product.service;

import com.dionisius.web.product.dto.input.ProductInput;
import com.dionisius.web.product.dto.output.ProductOutput;
import com.dionisius.web.product.model.Product;
import com.dionisius.web.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductOutput getOne(Long id) {
        Optional<Product> product = productRepository.findById(id);
        if (product.isEmpty()){
            return null;
        }
        return ProductOutput.builder().id(product.get().getId())
                .name(product.get().getName())
                .description(product.get().getDescription())
                .price(product.get().getPrice())
                .build();
    }

    @Override
    public List<ProductOutput> getAll() {
        Iterable<Product> products = productRepository.findAll();
        List<ProductOutput> productOutputs = new ArrayList<>();
        for (Product product : products){
            ProductOutput productOutput = ProductOutput.builder()
                    .id(product.getId())
                    .name(product.getName())
                    .description(product.getDescription())
                    .price(product.getPrice())
                    .build();
            productOutputs.add(productOutput);
        }
        return productOutputs;
    }

    @Override
    public void addOne(ProductInput productInput) {
        Product product = Product.builder()
                .name(productInput.getName())
                .description(productInput.getDescription())
                .price(productInput.getPrice())
                .build();
        productRepository.save(product);
    }
}

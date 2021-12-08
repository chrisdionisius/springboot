package com.dionisius.web.product.controller;

import com.dionisius.web.product.dto.input.ProductInput;
import com.dionisius.web.product.dto.output.ProductOutput;
import com.dionisius.web.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    @Qualifier("productServiceImpl")
    private ProductService productService;

    @GetMapping("/{id}")
    public ResponseEntity<ProductOutput> getOne(@PathVariable Long id) {
        ProductOutput productOutput = productService.getOne(id);
        return ResponseEntity.ok(productOutput);
    }

    @GetMapping
    public ResponseEntity<List<ProductOutput>> getAll(){
        List<ProductOutput> productOutputs = productService.getAll();
        return ResponseEntity.ok(productOutputs);
    }

    @PostMapping
    public ResponseEntity addOne(@RequestBody ProductInput productInput){
        productService.addOne(productInput);
        return ResponseEntity.ok(null);
    }
}

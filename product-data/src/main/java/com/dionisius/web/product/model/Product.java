package com.dionisius.web.product.model;

import lombok.*;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Product {
    private Long id;
    private String name,description;
    private Double price;
    private Date createdAt,updatedAt;
}

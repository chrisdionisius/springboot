package com.dionisius.web.product.model;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Product {
    private long id;
    private String name,description;

}

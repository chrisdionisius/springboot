package com.dionisius.web.product.dto.output;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ProductOutput {
    private long id;
    private String name,description;
    private Double price;
}

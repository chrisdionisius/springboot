package com.dionisius.web.product.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="products")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Product {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

//    tambahkan name untuk merubah nama kolom
    @Column(unique = true)
    private String name;
    @Column
    private String description;
    @Column
    private Double price;

    @Column
    @UpdateTimestamp
    private Date updatedAt;
    @Column
    @CreationTimestamp
    private Date createdAt;
}

package com.javaweb.automation.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@Getter
@Setter
@Entity
@Table(name = "products", schema = "market_automation")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "product_description", columnDefinition = "text")
    private String productDescription;

    @Column(name = "product_price", nullable = false, precision = 10, scale = 2)
    private BigDecimal productPrice;

    @Column(name = "product_created_at", nullable = true, columnDefinition = "timestamp default current_timestamp")
    private LocalDate productCreatedAt;
    
    @PrePersist
    protected void onCreate() {
        productCreatedAt = LocalDate.now();
    }

    
}

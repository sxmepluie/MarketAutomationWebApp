package com.javaweb.automation.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "sold_products", schema = "market_automation")
public class SoldProduct {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sold_product_id")
    private Long soldId;

    @Column(name = "sale_id")
    private Long saleId;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "sold_product_quantity")
    private int soldQuantity;

    @Column(name = "sold_date")
    private LocalDate soldDate;
    
    
}


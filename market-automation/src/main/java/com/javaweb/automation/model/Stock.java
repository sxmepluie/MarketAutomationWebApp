package com.javaweb.automation.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Getter
@Setter
@Entity
@Table(name = "stock", schema = "market_automation")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stock_id")
    private Long stockId;
    
    @Column(name = "product_id")
    private Long productId;

    @Column(name = "stock_quantity", nullable = false)
    private int stockQuantity;

    @Column(name = "last_updated_at")
    private LocalDateTime lastUpdatedAt;
    
    @PrePersist
    protected void onCreate() {
        lastUpdatedAt = LocalDateTime.now();
    }

}

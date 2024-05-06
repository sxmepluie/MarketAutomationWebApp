package com.javaweb.automation.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Getter
@Setter
@Entity
@Table(name = "sales", schema = "market_automation")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sale_id")
    private Long saleId;

    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "sale_date", nullable = false)
    private LocalDate saleDate;
}


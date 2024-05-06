package com.javaweb.automation.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.time.LocalDate;


@Data
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "customers", schema = "market_automation")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "customer_name", nullable = false)
    private String customerName;

    @Column(name = "customer_address", columnDefinition = "varchar(255) default ''")
    private String customerAddress;
    
    @Column(name = "customer_email")
    private String customerEmail;
    
    @Column(name = "customer_created_at")
    private LocalDate customerCreatedAt;

    @PrePersist
    protected void onCreate() {
        customerCreatedAt = LocalDate.now();
    }

}

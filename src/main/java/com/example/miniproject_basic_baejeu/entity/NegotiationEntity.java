package com.example.miniproject_basic_baejeu.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;

@Data
@Entity
@Table(name = "negotiation")
public class NegotiationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private Long suggested_price;

    private String status;

    public NegotiationEntity() {
    }
    @ManyToOne(fetch = FetchType.EAGER)
    private MarketEntity salesItem;

    @ManyToOne(fetch = FetchType.EAGER)
    private UserEntity user;
}

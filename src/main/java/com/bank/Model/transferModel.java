package com.bank.Model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.boot.registry.selector.spi.StrategySelector;

import java.time.LocalDateTime;


@Entity
@Table(name = "Transfer")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class transferModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long TransferID;
    private double montant;
    private LocalDateTime dateHeure;
    private String description;

}
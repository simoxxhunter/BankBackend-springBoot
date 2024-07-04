package com.bank.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.boot.registry.selector.spi.StrategySelector;

@Entity
@Table(name = "Compte")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class compteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long compteID;
    private String compteType;
    private double balance;
    private String statut;
    private String raisonCloture;
}

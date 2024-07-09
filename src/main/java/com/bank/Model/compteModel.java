package com.bank.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.boot.registry.selector.spi.StrategySelector;

import java.util.Set;

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

    @ManyToOne
    @JoinColumn(name="userID", nullable=false)
    private userModel user;


    @JsonIgnore
    @OneToMany(mappedBy="compte")
    private Set<transactionModel> transactions;

    @JsonIgnore
    @OneToMany(mappedBy = "compte")
    private Set<carteBancaireModel> cards;

    @JsonIgnore
    @OneToMany( mappedBy = "compte")
    private Set<transferModel> transfers;

    @JsonIgnore
    @OneToMany( mappedBy = "compte")
    private Set<beneficiaireModel> beneficiaries;
}

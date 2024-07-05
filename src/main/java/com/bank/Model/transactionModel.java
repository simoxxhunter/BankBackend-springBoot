package com.bank.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "Transactions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class transactionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long transactionID;
    private LocalDateTime dateHeure;
    private double montant;
    private String type;
    private String description;


    @ManyToOne
    @JoinColumn(name="compte", nullable=false)
    private compteModel compte;
}

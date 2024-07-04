package com.bank.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Set;

@Entity
@Table(name = "Carte ")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class carteBancaireModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long carteID;
    private String carteNumber;
    private String dateExpriration;
    private String carteType;
    private String statut;
    public  String raisonBlock;

}

package com.bank.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Benificiaire")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class beneficiaireModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long beneficiaireID;
    private String Name;
    private String AccountNo;
    private String BankName;



}

package com.bank.Model;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "Users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class userModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userID;
    private String userName;
    private String password;

    @JsonIgnore
    @OneToMany(mappedBy="user")
    private Set<compteModel> comptes;

}

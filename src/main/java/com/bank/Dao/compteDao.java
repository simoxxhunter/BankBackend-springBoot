package com.bank.Dao;

import com.bank.Model.compteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface compteDao extends JpaRepository<compteModel, Integer> {
}

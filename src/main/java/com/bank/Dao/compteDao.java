package com.bank.Dao;

import com.bank.Model.compteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface compteDao extends JpaRepository<compteModel, Integer> {
    public compteModel save(compteModel compte);
    List<compteModel> findByUser_UserID(long userID);


}

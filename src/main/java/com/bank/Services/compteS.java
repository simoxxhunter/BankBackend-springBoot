package com.bank.Services;

import com.bank.Model.compteModel;

import java.util.List;

public interface compteS {
    List<compteModel> getAllComptesByUserId(long userID);

    void createAccount(long userID, compteModel compte);

    double getcompteBalance(int compteId);

    List<compteModel>  getAllComptes();
}

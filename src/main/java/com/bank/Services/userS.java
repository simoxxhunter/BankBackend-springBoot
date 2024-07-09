package com.bank.Services;

import com.bank.Model.compteModel;

import java.util.List;

public interface userS {
     List<compteModel> getAllComptesByUserId(long userID);
}

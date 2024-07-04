package com.bank.Services;

import com.bank.Dao.compteDao;
import com.bank.Model.compteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class compteService {

    @Autowired
    private compteDao compteDao;

    public double getCompteBalance(int compteId) {
        compteModel compte = compteDao.getReferenceById(compteId);

        return compte.getBalance();
    }
}

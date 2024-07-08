package com.bank.Services;

import com.bank.Model.compteModel;
import com.bank.Dao.compteDao;
import com.bank.Dao.UserDao;
import com.bank.Model.compteModel;
import com.bank.Model.userModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class compteService {

    @Autowired
    private compteDao compteDao;

    @Autowired
    private UserDao userDao;

    public double getcompteBalance(int compteId) {
        compteModel compte = compteDao.getReferenceById(compteId);
        return compte.getBalance();
    }

    public void createAccount(long userID, compteModel compte) {
        userModel user = userDao.getReferenceById(userID);
        compte.setUser(user);
        compteDao.save(compte);
    }

    public List<compteModel> getAllComptesByUserId(long userID) {
        return compteDao.findByUser_UserID(userID);
    }
}

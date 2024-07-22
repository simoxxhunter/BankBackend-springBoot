package com.bank.Services;

import com.bank.Model.compteModel;
import com.bank.Dao.compteDao;
import com.bank.Dao.UserDao;
import com.bank.Model.userModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Service
@CrossOrigin(origins = "http://localhost:4200")

public class compteService implements  compteS {

    @Autowired
    private compteDao compteDao;

    @Autowired
    private UserDao userDao;

    public double getcompteBalance(int compteId) {
        compteModel compte = compteDao.getReferenceById(compteId);
        return compte.getBalance();
    }


    public  List<compteModel> getAllComptes() {
        return compteDao.findAll();
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

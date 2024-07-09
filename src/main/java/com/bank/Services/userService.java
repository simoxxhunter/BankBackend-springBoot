package com.bank.Services;

import com.bank.Dao.compteDao;
import com.bank.Model.compteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bank.Model.*;
import com.bank.Services.*;
import com.bank.Dao.*;

import java.util.List;

@Service
public class userService implements  userS {

    @Autowired
    private compteDao compteDao;

    public List<compteModel> getAllComptesByUserId(long userID) {
        return compteDao.findByUser_UserID(userID);
    }
}

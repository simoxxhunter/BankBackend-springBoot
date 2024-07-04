package com.bank.Controller;


import com.bank.Dao.compteDao;
import com.bank.Model.compteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping  ("/compte")

public class compteController {

    @Autowired
    private compteDao compteDao;


    @GetMapping("/{compteId}")
    public double getCompteBalance(@PathVariable int compteId) {
        compteModel compte = compteDao.getReferenceById(compteId);
        return compte.getBalance();
    }
}

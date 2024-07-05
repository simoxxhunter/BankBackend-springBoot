package com.bank.Controller;

import com.bank.Model.compteModel;
import com.bank.Services.compteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/compte")
public class compteController {

    @Autowired
    private compteService compteService;

    @Autowired
    private com.bank.Dao.compteDao compteDao;

    @PostMapping("/{createNewAccount}")
    public void createAccount(@RequestBody compteModel compte) {
        compteDao.save(compte);
        System.out.println("compte cree avec succee");

    }
    @GetMapping("/{compteId}")
    public double getCompteBalance(@PathVariable int compteId) {
        return compteService.getCompteBalance(compteId);
    }

}

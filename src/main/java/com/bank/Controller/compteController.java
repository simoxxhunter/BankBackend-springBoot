package com.bank.Controller;

import com.bank.Model.compteModel;
import com.bank.Services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compte")
public class compteController {

    @Autowired
    private compteS compteService;

    @PostMapping("/{userID}/createNewAccount")
    public void createAccount(@PathVariable long userID, @RequestBody compteModel compte) {
        compteService.createAccount(userID, compte);
        System.out.println("compte créé avec succès");
    }

    @GetMapping("/{compteId}")
    public double getcompteBalance(@PathVariable int compteId) {
        return compteService.getcompteBalance(compteId);
    }
    @GetMapping
    public List<compteModel> getAllComptes(){
        return compteService.getAllComptes();
    }



}

package com.bank.Controller;

import com.bank.Services.compteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/compte")
public class compteController {

    @Autowired
    private compteService compteService;

    @GetMapping("/{compteId}")
    public double getCompteBalance(@PathVariable int compteId) {
        return compteService.getCompteBalance(compteId);
    }
}

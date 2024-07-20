package com.bank.Controller;

import com.bank.Model.compteModel;
import com.bank.Services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")

@CrossOrigin(origins = "http://localhost:4200")

public class userController {

    @Autowired
    private userService userService;

    @GetMapping("/userid={userID}")
    public List<compteModel> getAllComptesByUserId(@PathVariable long userID) {
        return userService.getAllComptesByUserId(userID);
    }
}

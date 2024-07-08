package com.bank.Dao;

import com.bank.Model.compteModel;
import com.bank.Model.userModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bank.Model.*;
import com.bank.Services.*;
import com.bank.Dao.*;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<userModel, Long> {


}


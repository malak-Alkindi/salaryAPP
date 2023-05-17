package com.example.demoSalaryApp.controllers;

import com.example.demoSalaryApp.models.accountmodel;
import com.example.demoSalaryApp.requestobject.GetAccountRequestObject;
import com.example.demoSalaryApp.services.accountservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demoSalaryApp.responseopject.GetAccountResponse;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
public class account  {
    @Autowired
    accountservice accountservice;

    @RequestMapping("account/create")
    public void saveAccount() {
        createAccount();
    }

    @RequestMapping("account/get")
    public List<accountmodel> getAccount() {
        return accountservice.getAccount();
    }

    @RequestMapping("account/getone")
    public List<accountmodel> getOneAccount() {
        return accountservice.getOneAccount();
    }

    //Path Variable
    @RequestMapping("account/get/{Id}")
    public GetAccountResponse createAccount (@PathVariable Long Id) {
        return accountservice.getEmployeeById(Id);
    }
    public void createAccount() {
        accountmodel accountt = new accountmodel();
        accountt.setAccountType("Saving");
        accountt.setAccountNumber("40202020220");
        //account.setId(9092L);
        accountt.setBankName("Muscat");
        accountt.setBankBranch("Seeb");
        accountt.setBranchCode(121);
        accountt.setCreatedDate(new Date());
        accountt.setIsActive(true);
        accountt.setSwiftCode("93939");
        accountt.setAccountHolderName("Mohammed");
        accountservice.saveAccount(accountt);
    }
    @GetMapping("api/foos")
    @ResponseBody
    public String getFoos(@RequestParam String id) {

        accountmodel accountt = new accountmodel();
        accountt.setAccountType(id);
        accountservice.saveAccount(accountt);
        return "accountType: " + id;
    }
    public void createeEmployee(GetAccountRequestObject accountRequestObject) {

        accountmodel accountt = new accountmodel();
        accountt.setAccountType(accountRequestObject.getAccountType());
        accountt.setAccountNumber(accountRequestObject.getAccountNumber());
        //account.setId(9092L);
        accountt.setBankName(accountRequestObject.getBankName());
        accountt.setBankBranch(accountRequestObject.getBankBranch());
        accountt.setBranchCode(accountRequestObject.getBranchCode());
        accountt.setCreatedDate(new Date());
        accountt.setIsActive(true);
        accountt.setSwiftCode(accountRequestObject.getSwiftCode());
        accountt.setAccountHolderName(accountRequestObject.getAccountHolderName());
        accountservice.saveAccount(accountt);

    }


}

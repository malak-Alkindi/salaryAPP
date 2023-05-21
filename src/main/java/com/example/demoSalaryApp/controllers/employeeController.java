package com.example.demoSalaryApp.controllers;

import com.example.demoSalaryApp.models.BaseEntity;


import com.example.demoSalaryApp.models.accountModel;
import com.example.demoSalaryApp.services.accountService;
import com.example.demoSalaryApp.services.employeeService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demoSalaryApp.responseopject.GetAccountResponse;

import java.util.Date;
import java.util.List;

@RestController
public class employeeController extends BaseEntity {
    @Autowired
    employeeService empService;

    @RequestMapping("employee/create")
    public void saveAccount() {
        createAccount();
    }

    @RequestMapping("employee/get")
    public List<accountModel> getAccount() {
        return empService.getAccount();
    }

    @RequestMapping("employee/getone")
    public List<accountModel> getOneAccount() {
        return empService.getOneAccount();
    }

    //Path Variable
    @RequestMapping("employee/get/{Id}")
    public GetAccountResponse createAccount (@PathVariable Long Id) {
        return empService.getEmployeeById(Id);
    }

    @RequestMapping("employee/delete/{Id}")
    public void deleteeAccount (@PathVariable Long Id) {
        empService.deleteEmployeeById(Id);
    }
    public void createAccount() {
        accountModel accountt = new accountModel();
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
        empService.saveAccount(accountt);
    }
    @GetMapping("account/query")
    @ResponseBody
    public String getaccountQueryString(@RequestParam String a,@RequestParam String b,@RequestParam String c,@RequestParam String d) throws JsonProcessingException {
        accountModel accountObj = new accountModel();
        accountObj.setBankName(a);
        accountObj.setAccountNumber(b);
        accountObj.setBankBranch(c);
        accountObj.setSwiftCode(d);
        ObjectMapper mapper = new ObjectMapper();
        String accountObjString = mapper.writeValueAsString(empService.getAccountObjectAsString(accountObj));
        System.out.print(accountObjString);
        return accountObjString;
    }

}

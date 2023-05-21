package com.example.demoSalaryApp.services;


import com.example.demoSalaryApp.Repository.employeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demoSalaryApp.models.employeeModel;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

//import com.example.demoSalaryApp.responseopject.GetAccountResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class employeeService {

    @Autowired
    employeeRepository employeeReps;

    public void saveEmployee(employeeModel emp) {
        employeeReps.save(emp);
    }

    public List<employeeModel> getEmployee() {
        return employeeReps.findAll();
    }

    public List<employeeModel> getOneEmployee() {
        return employeeReps.findAllById(Collections.singleton((long) 2));
    }


//    public GetAccountResponse getEmployeeById(Long employeeId) {
//        Optional<accountModel> optionalaccount = accountresp.findById(employeeId);
//        if (!optionalaccount.isEmpty()) {
//            accountModel account = optionalaccount.get();
//            GetAccountResponse employeeResponse = new GetAccountResponse(account.getBankName(), account.getAccountNumber(),
//                    account.getBankBranch(), account.getSwiftCode());
//            return employeeResponse;
//        }
//
//        return null;
//
//    }

//    public GetAccountResponse getAccountObjectAsString(accountModel account) {
//
//
//        GetAccountResponse employeeResponse = new GetAccountResponse(account.getBankName(), account.getAccountNumber(),
//                account.getBankBranch(), account.getSwiftCode());
//        return employeeResponse;
//
//    }

//    public void deleteEmployeeById(Long employeeId) {
//
//        accountresp.deleteById(employeeId);
//
//    }
}

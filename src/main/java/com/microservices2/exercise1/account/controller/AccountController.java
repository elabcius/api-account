package com.microservices2.exercise1.account.controller;

import com.microservices2.exercise1.account.model.Account;
import com.microservices2.exercise1.account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @PostMapping
    public Account save(@RequestBody Account account) {
        return accountRepository.save(account);
    }

    @GetMapping
    public Iterable<Account> all(){
        return accountRepository.findAll();
    }

    @GetMapping(value = "/{accountId}")
    public Account findByAccountId(@PathVariable final Integer accountId){
        return accountRepository.findAccountByAccountId(accountId);
    }

    @PutMapping
    public Account update(@RequestBody Account account){
        return accountRepository.save(account);
    }

    @DeleteMapping
    public void delete(@RequestBody Account account){
        accountRepository.delete(account);
    }

    @GetMapping(value = "/account-type/{type}")
    public List<Account> findByAccountType(@PathVariable final String type){
        return accountRepository.findAllByAccountType(type);
    }

    @GetMapping(value = "/bank/{bank}")
    public List<Account> findByBank(@PathVariable final String bank){
        return accountRepository.findByBank(bank);
    }

    @GetMapping(value = "/customer/{customer}")
    public List<Account> findByCustomer(@PathVariable("customer") Integer customerId){
        return accountRepository.findAllByCustomerId(customerId);
    }
}

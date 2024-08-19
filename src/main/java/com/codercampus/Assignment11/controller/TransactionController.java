package com.codercampus.Assignment11.controller;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/transactions")
    public String getTransactions(ModelMap model){
        List<Transaction> transactions = transactionService.findAll();
        model.put("transactions", transactions);
        return "transactions";
    }
    //th:if and th:unless
    @GetMapping("/transactions/{transactionId}")
    public String getTransactionsById(@PathVariable Integer transactionId, ModelMap model)
    {
        //transactionService.populateData();
        Transaction transaction = transactionService.findById(transactionId);
        System.out.println(transaction);
        //System.out.println(transaction.);
        model.put("transaction", transaction);
        return "transactions";
    }

    @PostMapping("/transactions")
    public String postData(){
        return "redirect:/transactions";
    }
}

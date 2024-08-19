package com.codercampus.Assignment11.service;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    TransactionRepository transactionRepo;

    public Transaction findById(Integer transactionId) {
        return transactionRepo.findById(transactionId);
    }

    public void populateData() {
        transactionRepo.populateData();
    }

    public List<Transaction> findAll() {
        return transactionRepo.findAll();
    }
}

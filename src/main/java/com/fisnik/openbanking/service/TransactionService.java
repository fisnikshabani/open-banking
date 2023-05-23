package com.fisnik.openbanking.service;

import com.fisnik.openbanking.model.Transaction;
import com.fisnik.openbanking.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TransactionService {

    private final TransactionRepository transactionRepository;

    @Autowired
    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public List<Transaction> findAllTransactionsByAccountNumber(final Integer accountNUmber) {
        return transactionRepository.findAllByAccountNumber(accountNUmber);
    }
}

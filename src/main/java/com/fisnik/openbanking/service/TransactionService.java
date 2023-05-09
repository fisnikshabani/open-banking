package com.fisnik.openbanking.service;

import com.fisnik.openbanking.model.Transaction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TransactionService {

    public List<Transaction> findAllByAccountNumber(Integer accountNumber) {

        List<Transaction> transactionList = new ArrayList<>();

        transactionList.add(new Transaction("Purchase", new Date(), 12345, "USD",
                50.0, "Example Merchant", "example_logo.png"));

        transactionList.add(new Transaction("Withdrawal", new Date(), 1234567890, "USD",
                100.0, "Sedond Example Merchant", "example_logo.png"));

        transactionList.add(new Transaction("Purchase", new Date(), 1234567890, "USD",
                250.0, "Third Example Merchant", "example_logo.png"));

        transactionList.add(new Transaction("Deposit", new Date(), 1234567890, "USD",
                550.0, "Example Merchant", "example_logo.png"));

        return transactionList;
    }

}

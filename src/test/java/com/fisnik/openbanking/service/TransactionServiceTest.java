package com.fisnik.openbanking.service;

import com.fisnik.openbanking.model.Transaction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionServiceTest {

    @DisplayName("Find all transactions by account number")
    @Test
    void testFindAllByAccountNumber() {

        TransactionService transactionService = new TransactionService();

        Integer accountNUmber = 1234567890;

        List<Transaction> transactionList = transactionService.findAllByAccountNumber(accountNUmber);

        assertTrue(transactionList.size() >= 3 && transactionList.size() <= 5,
                "Expected 3 to 5 transactions, but found: " + transactionList.size());
    }
}
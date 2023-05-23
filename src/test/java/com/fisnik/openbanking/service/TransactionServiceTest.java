package com.fisnik.openbanking.service;

import com.fisnik.openbanking.OpenBankingApplication;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest(classes = {OpenBankingApplication.class})
class TransactionServiceTest {

    @Autowired
    private TransactionService transactionService;

    @Test
    void testTransactionCount() {
        assertEquals(2, transactionService.findAllTransactionsByAccountNumber(1234567).size());
    }
}
package com.fisnik.openbanking.controller;

import com.fisnik.openbanking.OpenBankingApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = {OpenBankingApplication.class})
@AutoConfigureMockMvc
class TransactionControllerIntegrationTest {


    @Autowired
    private MockMvc mockMvc;

    @Test
    void testTransactions() throws Exception {
        mockMvc.perform(
                get("/api/v1/transactions/1234567"))
                .andExpect(status().isOk());
    }
}
package com.fisnik.openbanking.controller;

import com.fisnik.openbanking.controller.dto.TransactionDto;
import com.fisnik.openbanking.model.Transaction;
import com.fisnik.openbanking.service.TransactionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/transactions")
public class TransactionController {
    
    private final TransactionService transactionService;
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("/{accountNumber}")
    public List<TransactionDto> findAllByAccountNumber(@PathVariable final Integer accountNumber) {

        return transactionService.findAllTransactionsByAccountNumber(accountNumber)
                .stream()
                .map(this::map)
                .collect(Collectors.toList());
    }

    private TransactionDto map(final Transaction tr) {
        return TransactionDto.apply(tr);
    }
}

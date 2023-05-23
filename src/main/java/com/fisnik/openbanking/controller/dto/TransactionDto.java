package com.fisnik.openbanking.controller.dto;

import com.fisnik.openbanking.model.Transaction;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class TransactionDto {

    private Long id;
    private String type;
    private Date date;
    private Integer accountNumber;
    private String currency;
    private Double amount;
    private String merchantName;
    private String merchantLogo;

    public static TransactionDto apply(final Transaction transaction) {
        var tr = new TransactionDtoBuilder()
                .id(transaction.getId())
                .type(transaction.getType())
                .accountNumber(transaction.getAccountNumber())
                .currency(transaction.getCurrency())
                .amount(transaction.getAmount())
                .merchantName(transaction.getMerchantName())
                .merchantLogo(transaction.getMerchantLogo())
                .build();

        return tr;
    }
}

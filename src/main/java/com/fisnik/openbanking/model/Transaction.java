package com.fisnik.openbanking.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    private String type;
    private Date date;
    private Integer accountNumber;
    private String currency;
    private Double amount;
    private String merchantName;
    private String merchantLogo;
}

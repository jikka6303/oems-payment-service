package com.bits.oems.payment.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("payments")
public class Payment {

    @Id
    private String paymentId;

    private double amount;

    private String currency;

    private String referenceId;

    private String username;

}

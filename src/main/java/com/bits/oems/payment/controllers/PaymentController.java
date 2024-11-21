package com.bits.oems.payment.controllers;

import com.bits.oems.commons.model.PaymentDTO;
import com.bits.oems.payment.services.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api")
@Validated
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @GetMapping(value = "/payments/{paymentId}/users/{username}/events/{eventId}")
    public PaymentDTO getPayment(
            @PathVariable("paymentId") String paymentId,
            @PathVariable("username") String username,
            @PathVariable("eventId") String eventId
    ) {
        return paymentService.getPayment(paymentId, username, eventId);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/payments")
    public void addPayment(@RequestBody PaymentDTO payment) {
        paymentService.addPayment(payment);
    }

    @GetMapping(value = "/payments")
    List<PaymentDTO> getPayments(@RequestParam String username) {
        return paymentService.getPayments(username);
    }

}

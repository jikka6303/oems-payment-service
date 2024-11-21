package com.bits.oems.payment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "No such payment found")
public class NoSuchPaymentRuntimeException extends RuntimeException {
    public NoSuchPaymentRuntimeException() {
        super("No such payment found");
    }
}

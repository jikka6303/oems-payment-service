package com.bits.oems.payment.services.mapper;

import com.bits.oems.commons.model.PaymentDTO;
import com.bits.oems.payment.model.Payment;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ServiceMapper {

    Payment mapToPayment(PaymentDTO payment);

    PaymentDTO mapToPaymentDTO(Payment payment);

    List<PaymentDTO> mapToPaymentDTOs(List<Payment> payments);
}


package com.bits.oems.payment.services.mapper;

import com.bits.oems.commons.model.PaymentDTO;
import com.bits.oems.payment.model.Payment;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-20T22:04:45+0530",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.11 (Amazon.com Inc.)"
)
@Component
public class ServiceMapperImpl implements ServiceMapper {

    @Override
    public Payment mapToPayment(PaymentDTO payment) {
        if ( payment == null ) {
            return null;
        }

        Payment payment1 = new Payment();

        payment1.setPaymentId( payment.getPaymentId() );
        payment1.setAmount( payment.getAmount() );
        payment1.setCurrency( payment.getCurrency() );
        payment1.setReferenceId( payment.getReferenceId() );
        payment1.setUsername( payment.getUsername() );

        return payment1;
    }

    @Override
    public PaymentDTO mapToPaymentDTO(Payment payment) {
        if ( payment == null ) {
            return null;
        }

        PaymentDTO paymentDTO = new PaymentDTO();

        paymentDTO.setPaymentId( payment.getPaymentId() );
        paymentDTO.setAmount( payment.getAmount() );
        paymentDTO.setCurrency( payment.getCurrency() );
        paymentDTO.setReferenceId( payment.getReferenceId() );
        paymentDTO.setUsername( payment.getUsername() );

        return paymentDTO;
    }

    @Override
    public List<PaymentDTO> mapToPaymentDTOs(List<Payment> payments) {
        if ( payments == null ) {
            return null;
        }

        List<PaymentDTO> list = new ArrayList<PaymentDTO>( payments.size() );
        for ( Payment payment : payments ) {
            list.add( mapToPaymentDTO( payment ) );
        }

        return list;
    }
}

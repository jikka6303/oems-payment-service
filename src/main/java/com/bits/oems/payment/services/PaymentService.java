package com.bits.oems.payment.services;

import com.bits.oems.commons.model.PaymentDTO;
import com.bits.oems.payment.exception.NoSuchPaymentRuntimeException;
import com.bits.oems.payment.model.Payment;
import com.bits.oems.payment.repository.PaymentRepository;
import com.bits.oems.payment.services.mapper.ServiceMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final ServiceMapper serviceMapper;
    private final PaymentRepository paymentRepository;

    public void addPayment(PaymentDTO paymentDTO) {
        Payment payment = serviceMapper.mapToPayment(paymentDTO);
        paymentRepository.save(payment);
    }

    public PaymentDTO getPayment(String paymentId, String username, String eventId) {
        return paymentRepository.findById(paymentId)
                .filter(payment -> payment.getUsername().equals(username))
                .filter(payment -> payment.getReferenceId().equals(eventId))
                .map(serviceMapper::mapToPaymentDTO)
                .orElseThrow(NoSuchPaymentRuntimeException::new);
    }

    public List<PaymentDTO> getPayments(String username) {
        return serviceMapper.mapToPaymentDTOs(paymentRepository.findByUsername(username));
    }
}

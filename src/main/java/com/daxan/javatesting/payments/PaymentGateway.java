package com.daxan.javatesting.payments;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);
}

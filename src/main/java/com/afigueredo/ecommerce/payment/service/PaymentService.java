package com.afigueredo.ecommerce.payment.service;

import com.afigueredo.ecommerce.checkout.event.CheckoutCreatedEvent;
import com.afigueredo.ecommerce.payment.entity.PaymentEntity;

import java.util.Optional;

public interface PaymentService {

    Optional<PaymentEntity> create(CheckoutCreatedEvent checkoutCreatedEvent);
}

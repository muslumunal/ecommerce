package com.unal.store.ecommerce.service;

import com.unal.store.ecommerce.dto.Purchase;
import com.unal.store.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}

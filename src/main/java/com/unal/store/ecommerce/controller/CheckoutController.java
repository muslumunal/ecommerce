package com.unal.store.ecommerce.controller;

import com.unal.store.ecommerce.dto.Purchase;
import com.unal.store.ecommerce.dto.PurchaseResponse;
import com.unal.store.ecommerce.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {
    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService){
        this.checkoutService = checkoutService;
    }


    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase){
        PurchaseResponse response = checkoutService.placeOrder(purchase);
        return response;
    }
}

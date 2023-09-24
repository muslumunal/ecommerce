package com.unal.store.ecommerce.dto;

import com.unal.store.ecommerce.entity.Address;
import com.unal.store.ecommerce.entity.Customer;
import com.unal.store.ecommerce.entity.Order;
import com.unal.store.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}

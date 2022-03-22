package com.example.btvn_cart.service;

import com.example.btvn_cart.reponsitory.ICartReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService implements ICartService{
    @Autowired
    ICartReponsitory iCartReponsitory;
}

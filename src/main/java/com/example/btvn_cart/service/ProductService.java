package com.example.btvn_cart.service;

import com.example.btvn_cart.reponsitory.IProductReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {

    @Autowired
    IProductReponsitory iProductReponsitory;
}

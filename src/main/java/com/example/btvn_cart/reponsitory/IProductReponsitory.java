package com.example.btvn_cart.reponsitory;

import com.example.btvn_cart.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductReponsitory extends JpaRepository<Product,String> {

}

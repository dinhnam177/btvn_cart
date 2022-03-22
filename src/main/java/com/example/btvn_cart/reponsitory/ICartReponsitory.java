package com.example.btvn_cart.reponsitory;

import com.example.btvn_cart.domain.Cart;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICartReponsitory extends JpaRepository<Cart,String> {
    @Query("SELECT p FROM Positions p WHERE p.id IN (:ids)")
    List<Cart> findOneByIdWithEntityGraphTags(@Param("ids") List ids);
}

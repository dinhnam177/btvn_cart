package com.example.btvn_cart;

import com.example.btvn_cart.reponsitory.ICartReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BtvnCartApplication implements CommandLineRunner {
	@Autowired
	ICartReponsitory iCartReponsitory;

	public static void main(String[] args) {
		SpringApplication.run(BtvnCartApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}

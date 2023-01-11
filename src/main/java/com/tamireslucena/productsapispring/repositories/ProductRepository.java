package com.tamireslucena.productsapispring.repositories;

import com.tamireslucena.productsapispring.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

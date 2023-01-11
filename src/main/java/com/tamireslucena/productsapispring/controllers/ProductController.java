package com.tamireslucena.productsapispring.controllers;

import com.tamireslucena.productsapispring.models.Product;
import com.tamireslucena.productsapispring.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @PostMapping
    public ResponseEntity createProduct(@RequestBody Product product){
        productRepository.save(product);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity listProducts(){
        List<Product> products = productRepository.findAll();
        if(products.isEmpty()){
            return new ResponseEntity( "Não existem produtos para exibir.", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(products, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity getProduct(@PathVariable Long id) {
        Optional<Product> product = productRepository.findById(id);
        if(product.isEmpty()){
            return new ResponseEntity( "Produto de id " + id + " não existe.", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(product, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateProduct(@RequestBody Product product){
        productRepository.save(product);
        return new ResponseEntity(product, HttpStatus.OK);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity deleteProduct(@PathVariable Long id){
        productRepository.deleteById(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);

    }
}

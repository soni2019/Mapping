package com.hcl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.entity.Product;

@Repository
public interface IProductRepo extends JpaRepository<Product, Long> {

}

package com.tnsif.shoppingmall.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.shoppingmall.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {

}

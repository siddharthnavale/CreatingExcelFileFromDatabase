package com.example.demo.Repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Mobile;

@Repository
public interface MobileRepository extends JpaRepository<Mobile, Integer>{

}

package com.sveticov.h2spring.repository;

import com.sveticov.h2spring.model.Box.Box;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BoxRepository extends JpaRepository< Box,Integer> {
}

package com.jirachai.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jirachai.domain.entity.Hello;

@Repository
public interface HelloRepository extends JpaRepository<Hello, Integer> {

}
                           
package io.duykhanh471.burogu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.duykhanh471.burogu.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    
}
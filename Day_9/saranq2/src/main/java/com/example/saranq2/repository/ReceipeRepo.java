package com.example.saranq2.repository;

import org.springframework.data.jpa.repository.Query;

import com.example.saranq2.model.Receipe;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ReceipeRepo extends JpaRepository<Receipe,Integer> {
    
    @Query("SELECT u FROM Receipe u WHERE u.name = :name")
    public List<Receipe> getByName(String name);
    
}

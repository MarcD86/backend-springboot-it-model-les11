package com.example.backendspringboottechitmodel.Repositories;

import com.example.backendspringboottechitmodel.Models.Televisions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface TelevisionRepository extends JpaRepository<Televisions, Integer>{
        Optional<Televisions> findById(int id);
//        Optional<Televisions> findByName(String name);
        //check jpa repository / nu kun je find by name aanmaken
}

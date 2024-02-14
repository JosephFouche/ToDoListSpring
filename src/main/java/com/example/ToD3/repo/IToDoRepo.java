package com.example.ToD3.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ToD3.model.ToDo;

@Repository
public interface IToDoRepo extends JpaRepository<ToDo, Long>{

}
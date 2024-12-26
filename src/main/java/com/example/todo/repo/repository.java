package com.example.todo.repo;

import com.example.todo.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repository extends JpaRepository<Employer,Long> {
}

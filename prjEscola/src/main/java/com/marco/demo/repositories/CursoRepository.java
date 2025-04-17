package com.marco.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marco.demo.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

}

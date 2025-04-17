package com.marco.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marco.demo.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}

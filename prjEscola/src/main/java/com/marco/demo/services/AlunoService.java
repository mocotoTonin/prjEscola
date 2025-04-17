package com.marco.demo.services;

import com.marco.demo.entities.Aluno;
import com.marco.demo.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {
	private final AlunoRepository alunoRepository;
	
	@Autowired
    public AlunoService(AlunoRepository alunoRepository) {
    	this.alunoRepository = alunoRepository;
    }

    public Aluno findAlunoById(Long id) {
        Optional<Aluno> aluno = alunoRepository.findById(id);
        return aluno.orElse(null);
    }

    public List <Aluno> findAllAlunos() {
        return alunoRepository.findAll();
    }
    
    public Aluno saveAluno (Aluno aluno) {
    	return alunoRepository.save(aluno);
    }
}

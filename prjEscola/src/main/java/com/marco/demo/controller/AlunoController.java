package com.marco.demo.controller;

import com.marco.demo.entities.Aluno;
import com.marco.demo.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoService alunoService;

    @Autowired
    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    // GET /alunos/{id}
    @GetMapping("/{id}")
    public Aluno getAluno(@PathVariable Long id) {
        return alunoService.findAlunoById(id);
    }

    // GET /alunos
    @GetMapping
    public List<Aluno> getAllAlunos() {
        return alunoService.findAllAlunos();
    }

    // POST /alunos/create
    @PostMapping("/create")
    public Aluno createAluno(@RequestBody Aluno aluno) {
        return alunoService.saveAluno(aluno);
    }
}



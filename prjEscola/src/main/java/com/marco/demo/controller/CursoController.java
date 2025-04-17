package com.marco.demo.controller;

import com.marco.demo.entities.Curso;
import com.marco.demo.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    private final CursoService cursoService;

    @Autowired
    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    // GET /cursos/{id}
    @GetMapping("/{id}")
    public Curso getCurso(@PathVariable Long id) {
        return cursoService.findCursoById(id);
    }

    // GET /cursos
    @GetMapping
    public List<Curso> getAllCursos() {
        return cursoService.findAllCursos();
    }

    // POST /cursos
    @PostMapping("/create")
    public Curso createCurso(@RequestBody Curso curso) {
        return cursoService.saveCurso(curso);
    }
}

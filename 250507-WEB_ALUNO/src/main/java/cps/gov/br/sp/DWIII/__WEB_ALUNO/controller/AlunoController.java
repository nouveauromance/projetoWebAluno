package cps.gov.br.sp.DWIII.__WEB_ALUNO.controller;

import cps.gov.br.sp.DWIII.__WEB_ALUNO.entity.Aluno;
import cps.gov.br.sp.DWIII.__WEB_ALUNO.service.AlunoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/usuarios")
public class AlunoController {

    private final AlunoService alunoService;

    @PostMapping
    public ResponseEntity<Aluno> create(@RequestBody Aluno aluno){
        Aluno aluno1 = alunoService.salvar(aluno);
        return ResponseEntity.status(HttpStatus.CREATED).body(aluno1);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Aluno> getById(@PathVariable Long id){
        Aluno aluno1 = alunoService.buscarPorId(id);
        return ResponseEntity.ok(aluno1);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Aluno> updatePassword(@PathVariable Long id, @RequestBody Aluno aluno){
        Aluno aluno1 = alunoService.editarSenha(id, aluno.getSenha());
        return ResponseEntity.ok(aluno);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Aluno> deleteById(@PathVariable Long id){
        alunoService.deletarPorId(id);
        return ResponseEntity.noContent().build();
    };

    @DeleteMapping("/deletartodos")
    public ResponseEntity<Void> deleteAll(){
        alunoService.deletarTodos();
        return ResponseEntity.noContent().build();
    }
}

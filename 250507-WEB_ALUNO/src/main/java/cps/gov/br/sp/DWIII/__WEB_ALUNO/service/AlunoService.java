package cps.gov.br.sp.DWIII.__WEB_ALUNO.service;


import cps.gov.br.sp.DWIII.__WEB_ALUNO.entity.Aluno;
import cps.gov.br.sp.DWIII.__WEB_ALUNO.repository.AlunoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;

    @Transactional
    public Aluno salvar(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    @Transactional(readOnly = true)
    public Aluno buscarPorId(Long id) {
        return alunoRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Usuario não encontrado...")
        );
    }

    @Transactional
    public Aluno editarSenha(Long id, String senha) {
        Aluno aluno = buscarPorId(id);
        aluno.setSenha(senha);
        return aluno;
    }

    @Transactional
    public void deletarPorId(Long id) {
        if (!alunoRepository.existsById(id)) {
            throw new RuntimeException("Usuario não encontrado...");
        }
        alunoRepository.deleteById(id);
    }

    @Transactional
    public void deletarTodos() {
        alunoRepository.deleteAll();
    }

    @Transactional(readOnly = true)
    public String getPassword(Long id) {
        Aluno aluno = buscarPorId(id);
        return aluno.getSenha(); 
    }
}



package cps.gov.br.sp.DWIII.__WEB_ALUNO.repository;

import cps.gov.br.sp.DWIII.__WEB_ALUNO.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}

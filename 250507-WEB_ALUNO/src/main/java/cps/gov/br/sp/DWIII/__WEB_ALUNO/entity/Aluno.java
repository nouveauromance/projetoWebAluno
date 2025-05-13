package cps.gov.br.sp.DWIII.__WEB_ALUNO.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.management.relation.Role;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter @Setter @NoArgsConstructor
@Entity
@Table(name = "aluno")
public class Aluno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "Usuario", nullable = false, length = 100)
    private String usuario;

    @Column(name = "Senha", nullable = false, length = 100)
    private String senha;

    @Column(name = "Nome", nullable = false, length = 200)
    private String nome;

    @Column(name = "Curso", nullable = false, length = 100)
    private String curso;

    @Column(name = "Email", nullable = false, length = 255)
    private String email;

    @Column(name = "Telefone", nullable = false, length = 15)
    private String telefone;

    @Column(name = "Status", nullable = false, length = 30)
    private String status;

    @Column(name = "Disciplina", nullable = false, length = 50)
    private String disciplina;

    @Column(name = "Nota1")
    private Double nota1;

    @Column(name = "Nota2")
    private Double nota2;

    @Column(name = "Media")
    private Double media;

}
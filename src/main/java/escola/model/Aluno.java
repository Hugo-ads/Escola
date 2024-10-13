package escola.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_aluno")
public class Aluno {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String matricula;
    private String serie;
    private String sala;
    private String professor;

    @OneToOne(cascade = CascadeType.ALL)
    private Matematica matematica;

    @OneToOne(cascade = CascadeType.ALL)
    private Ciencias ciencias;

    @OneToOne(cascade = CascadeType.ALL)
    private Portugues portugues;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Disciplina> disciplinas;

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public Matematica getMatematica() {
        return matematica;
    }

    public void setMatematica(Matematica matematica) {
        this.matematica = matematica;
    }

    public Ciencias getCiencias() {
        return ciencias;
    }

    public void setCiencias(Ciencias ciencias) {
        this.ciencias = ciencias;
    }

    public Portugues getPortugues() {
        return portugues;
    }

    public void setPortugues(Portugues portugues) {
        this.portugues = portugues;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

}
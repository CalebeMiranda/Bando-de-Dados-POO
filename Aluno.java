package ufj.edu.br.teste.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Alunos")
public class Aluno extends Pessoa {
//atributos
@Column(nullable = false)
private int matricula;
@Column(nullable = false)
private String Curso;

//construtores
public Aluno(){

}

public Aluno(int idade, String nome, int matricula, String curso) {
    super(idade, nome);
    this.matricula = matricula;
    Curso = curso;
}

public int getMatricula() {
    return matricula;
}
public void setMatricula(int matricula) {
    this.matricula = matricula;
}
public String getCurso() {
    return Curso;
}
public void setCurso(String curso) {
    Curso = curso;
}
@Override
public String toString() {
    return "Aluno [matricula=" + matricula + ", Curso=" + Curso + "]";
}





}

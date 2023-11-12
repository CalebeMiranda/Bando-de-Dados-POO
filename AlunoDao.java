package ufj.edu.br.teste.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ufj.edu.br.teste.Model.Aluno;

public interface AlunoDao extends JpaRepository<Aluno,Integer> {
    

}

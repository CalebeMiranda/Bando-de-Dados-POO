package ufj.edu.br.teste;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ufj.edu.br.teste.Dao.AlunoDao;
import ufj.edu.br.teste.Dao.DisciplinaDao;
import ufj.edu.br.teste.Model.Aluno;
import ufj.edu.br.teste.Model.Disciplina;

@SpringBootApplication
public class TesteApplication implements CommandLineRunner{

	@Autowired
	private AlunoDao alunoDao;

	@Autowired
	private DisciplinaDao disciplinaDao;


	public static void main(String[] args) {
		SpringApplication.run(TesteApplication.class, args);
	}

	

	@Override
	public void run(String... args) throws Exception {
		Aluno a1 = new Aluno(17, "João", 1, "Direito");
		Aluno a2 = new Aluno(21, "Calebe", 2, "Computação");
		Aluno a3 = new Aluno(19, "Alisson", 3, "Computação");
		Disciplina d1 = new Disciplina(1,"Poo",64);
		Disciplina d2 = new Disciplina(2, "Calculo", 64);
		Disciplina d3 = new Disciplina(3, "Arq de Comp", 64);


		alunoDao.save(a1);
		alunoDao.save(a2);
		alunoDao.save(a3);
		disciplinaDao.save(d1);
		disciplinaDao.save(d2);
		disciplinaDao.save(d3);
	}

}

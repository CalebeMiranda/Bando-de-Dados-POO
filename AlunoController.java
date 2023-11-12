package ufj.edu.br.teste.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ufj.edu.br.teste.Dao.AlunoDao;
import ufj.edu.br.teste.Model.Aluno;



@RestController
@RequestMapping(value = "/Alunos")
public class AlunoController {
    //atributos
    @Autowired
    private AlunoDao aDao;

    //métodos
    @GetMapping("/listar/{Id}")
    public Optional <Aluno> buscarum(@PathVariable int Id){
        return aDao.findById(Id);
    }

    @GetMapping("/listar")
    public List <Aluno> buscarTodos(){
        return aDao.findAll();
    }

    @PostMapping("/gravar")
    public Aluno gravar(@RequestBody Aluno obj){
        return aDao.save(obj);
    }

    @DeleteMapping("/excluir/{Id}")
    public void excluir(@PathVariable int Id){
        aDao.deleteById(Id);
    }
}

package ufj.edu.br.teste.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ufj.edu.br.teste.Dao.DisciplinaDao;
import ufj.edu.br.teste.Model.Disciplina;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping(value = "/Disciplina")
public class DisciplinaController {

    //atributos
    @Autowired
    private DisciplinaDao repository;
    
    //métodos
    @GetMapping("/listar/{Id}")
    public Optional <Disciplina> buscarum (@PathVariable int Id){
        return repository.findById(Id);
    }
    @GetMapping("/listar")
    public List<Disciplina> listar(){
        List<Disciplina>list = repository.findAll();
        return list;
    }
    
    @PostMapping("/gravar")
    public Disciplina gravar(@RequestBody Disciplina obj){
        return repository.save(obj);
    }

    @DeleteMapping("/excluir/{Id}")
    public void excluir(@PathVariable int Id){
        repository.deleteById(Id);
    }

}

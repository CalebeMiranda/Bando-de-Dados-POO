package ufj.edu.br.teste.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Disciplina")
public class Disciplina {

// atributos
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "Disciplina_ID")
private int id;
@Column(name = "Disciplina_name")
private String name;
@Column(name = "Disciplina_ch")
private int ch;

//construtores
public Disciplina(){

}

public Disciplina(int id, String name, int ch) {
    this.id = id;
    this.name = name;
    this.ch = ch;
}

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public int getCh() {
    return ch;
}

public void setCh(int ch) {
    this.ch = ch;
}

@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + id;
    return result;
}

@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Disciplina other = (Disciplina) obj;
    if (id != other.id)
        return false;
    return true;
}






}

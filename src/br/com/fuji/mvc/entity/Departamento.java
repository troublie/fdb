package br.com.fuji.mvc.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="depto")
public class Departamento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="depto_id")
	private int deptoId;
	
	@Column(name="nome")
	private String nome;
	
	
	@OneToMany(mappedBy = "depto")
    private List<Usuario> usuarios;
	
	public Departamento(){
		
	}

	public int getDeptoId() {
		return deptoId;
	}

	public void setDeptoId(int deptoId) {
		this.deptoId = deptoId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	@Override
	public String toString() {
		return "Departamento [deptoId=" + deptoId + ", nome=" + nome + ", usuarios=" + usuarios + "]";
	}
	
}

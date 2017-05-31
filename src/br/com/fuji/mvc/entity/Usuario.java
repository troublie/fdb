package br.com.fuji.mvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="usuario_id")
	private int usuarioId;
	
	@ManyToOne
    @JoinColumn(name = "depto_id")
	private Departamento depto;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="sobrenome")
	private String sobreNome;
	
	@Column(name="email")
	private String email;
	
	@Column(name="senha")
	private String senha;
	
	public Usuario(){
		
	}

	public int getUsuarioId() {
		return usuarioId;
	}

	public Departamento getDepto() {
		return depto;
	}

	public void setDepto(Departamento depto) {
		this.depto = depto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setUsuario_id(int usuarioId) {
		this.usuarioId = usuarioId;
	}

	@Override
	public String toString() {
		return "Usuario [usuarioId=" + usuarioId + ", nome=" + nome + ", sobreNome=" + sobreNome + ", email=" + email
				+ ", senha=" + senha + "]";
	}
	
}

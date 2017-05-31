package br.com.fuji.mvc.dao;

import java.util.List;

import br.com.fuji.mvc.entity.Usuario;

public interface UsuarioDAO {
	
public List<Usuario> getUsuarios();
	
	public void saveUsuario();
	
	public Usuario getUsuario(int id);
	
	public void deleteUsuario(int id);
}


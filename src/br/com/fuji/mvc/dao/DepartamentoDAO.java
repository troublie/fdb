package br.com.fuji.mvc.dao;

import java.util.List;

import br.com.fuji.mvc.entity.Departamento;

public interface DepartamentoDAO {
	
	public List<Departamento> getDepartamentos();
	
	public void saveDepartamento(Departamento departamento);
	
	public Departamento getDepartamento(int id);
	
	public void deleteDepartamento(int id);
	
}

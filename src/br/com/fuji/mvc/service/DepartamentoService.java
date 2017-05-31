package br.com.fuji.mvc.service;

import java.util.List;

import br.com.fuji.mvc.entity.Departamento;

public interface DepartamentoService {

	public List<Departamento> getDepartamentos();

	public void saveDepartamento(Departamento departamento);

	public Departamento getDepartamento(int id);

	public void deleteDepartamento(int id);

}

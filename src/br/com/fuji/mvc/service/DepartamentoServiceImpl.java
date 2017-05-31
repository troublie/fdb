package br.com.fuji.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fuji.mvc.dao.DepartamentoDAO;
import br.com.fuji.mvc.entity.Departamento;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {

	// injetar o DepartamentoDAO
	@Autowired
	private DepartamentoDAO departamentoDAO;

	@Override
	@Transactional
	public List<Departamento> getDepartamentos() {

		return departamentoDAO.getDepartamentos();
	}

	@Override
	@Transactional
	public void saveDepartamento(Departamento departamento) {

		departamentoDAO.saveDepartamento(departamento);
	}

	@Override
	@Transactional
	public Departamento getDepartamento(int id) {

		return departamentoDAO.getDepartamento(id);
	}

	@Override
	@Transactional
	public void deleteDepartamento(int id) {

		departamentoDAO.deleteDepartamento(id);

	}

}

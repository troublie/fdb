package br.com.fuji.mvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.fuji.mvc.entity.Departamento;

@Repository
public class DepartamentoDAOImpl implements DepartamentoDAO {

	// injetar o session factory

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Departamento> getDepartamentos() {

		// recuperar a sessão atual
		Session currentSession = sessionFactory.getCurrentSession();

		// criar a query para recuperar uma lista de departamentos
		Query<Departamento> query = currentSession.createQuery("from Departamento order by nome", Departamento.class);

		// pegar o resultado e guardar na lista
		List<Departamento> departamentos = query.getResultList();

		return departamentos;
	}

	@Override
	public void saveDepartamento(Departamento departamento) {

		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// save the departamento .. finally
		currentSession.saveOrUpdate(departamento);
	}

	@Override
	public Departamento getDepartamento(int id) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		Departamento departamento = currentSession.get(Departamento.class, id);
		return departamento;
	}

	@Override
	public void deleteDepartamento(int id) {

		Session currentSession = sessionFactory.getCurrentSession();

		Query query = currentSession.createQuery("delete from Departamento where id=:departamentoId");
		query.setParameter("departamentoId", id);

		query.executeUpdate();

	}
}

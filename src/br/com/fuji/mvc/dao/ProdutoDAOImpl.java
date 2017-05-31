package br.com.fuji.mvc.dao;

import java.util.List;
import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.fuji.mvc.entity.Produto;

@Repository
public class ProdutoDAOImpl implements ProdutoDAO {

	// injetar o session factory

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Produto> getProdutos() {

		// recuperar a sessão atual
		Session currentSession = sessionFactory.getCurrentSession();

		// criar a query para recuperar uma lista de produtos
		Query<Produto> query = currentSession.createQuery("from Produto order by partNumber", Produto.class);

		// pegar o resultado e guardar na lista
		List<Produto> produtos = query.getResultList();

		return produtos;
	}

	@Override
	public void saveProduto(Produto produto) {

		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// save the produto .. finally
		currentSession.saveOrUpdate(produto);
	}

	@Override
	public Produto getProduto(int id) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		Produto produto = currentSession.get(Produto.class, id);
		return produto;
	}

	@Override
	public void deleteProduto(int id) {

		Session currentSession = sessionFactory.getCurrentSession();

		Query query = currentSession.createQuery("delete from Produto where id=:produtoId");
		query.setParameter("produtoId", id);

		query.executeUpdate();

	}

	@Override
	public List<Produto> searchProdutos(String search) {
		Session currentSession = sessionFactory.getCurrentSession();
		List<Produto> produtos = null;
		CriteriaBuilder cb = currentSession.getCriteriaBuilder();
        CriteriaQuery<Produto> criteria = cb.createQuery(Produto.class);
        Root<Produto> from = criteria.from(Produto.class);
        criteria.select(from);
		criteria.where(cb.like(from.get("partNumber"), "%" + search + "%"));
        TypedQuery<Produto> typed = currentSession.createQuery(criteria);
        produtos = typed.getResultList();
        System.out.println(produtos);
        return produtos;
	}
}

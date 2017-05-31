package br.com.fuji.mvc.service;

import java.util.List;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fuji.mvc.dao.ProdutoDAO;
import br.com.fuji.mvc.entity.Produto;

@Service
public class ProdutoServiceImpl implements ProdutoService {

	// injetar o ProdutoDAO
	@Autowired
	private ProdutoDAO produtoDAO;

	@Override
	@Transactional
	public List<Produto> getProdutos() {

		return produtoDAO.getProdutos();
	}

	@Override
	@Transactional
	public void saveProduto(Produto produto) {

		produtoDAO.saveProduto(produto);
	}

	@Override
	@Transactional
	public Produto getProduto(int id) {

		return produtoDAO.getProduto(id);
	}

	@Override
	@Transactional
	public void deleteProduto(int id) {

		produtoDAO.deleteProduto(id);

	}

	@Override
	@Transactional
	public List<Produto> searchProdutos(String search) {
		
		return produtoDAO.searchProdutos(search);
	}

}

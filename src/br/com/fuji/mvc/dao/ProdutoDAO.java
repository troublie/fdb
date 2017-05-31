package br.com.fuji.mvc.dao;

import java.util.List;
import java.util.List;

import br.com.fuji.mvc.entity.Produto;

public interface ProdutoDAO {

	public List<Produto> getProdutos();

	public Produto getProduto(int id);

	public void deleteProduto(int id);

	void saveProduto(Produto produto);

	public List<Produto> searchProdutos(String search);
}

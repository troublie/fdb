package br.com.fuji.mvc.service;

import java.util.List;
import java.util.List;

import br.com.fuji.mvc.entity.Produto;

public interface ProdutoService {

	public List<Produto> getProdutos();

	public void saveProduto(Produto produto);

	public Produto getProduto(int id);

	public void deleteProduto(int id);

	public List<Produto> searchProdutos(String search);
}

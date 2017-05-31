package br.com.fuji.mvc.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.fuji.mvc.entity.Produto;
import br.com.fuji.mvc.service.ProdutoService;

@Controller
@RequestMapping("/produto")
public class ProdutoController {

	// injetar o produtoService
	@Autowired
	private ProdutoService produtoService;

	@GetMapping("/list")
	public String listaProduto(Model model) {

		List<Produto> produtos = produtoService.getProdutos();

		// adicionar ao modelo (para posterior envio a view)
		model.addAttribute("produtos", produtos);

		return "lista-produtos";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {

		// create model attribute to bind form data
		Produto produto = new Produto();

		theModel.addAttribute("produto", produto);

		return "produto-form";
	}

	@PostMapping("/saveProduto")
	public String saveProduto(@ModelAttribute("produto") Produto produto) {

		// save the produto using our service
		produtoService.saveProduto(produto);

		return "redirect:/produto/";
	}

	@GetMapping("/delete")
	public String delete(@RequestParam("produtoId") int id, Model theModel) {

		produtoService.deleteProduto(id);

		return "redirect:/produto/list";
	}

	@GetMapping("/")
	public String showProdutoMain() {
		return "produto-main";
	}

	@GetMapping("/showFormForSearch")
	public String showFormForSearch(Model theModel) {
		Produto produto = new Produto();
		theModel.addAttribute("produto", produto);
		return "produto-search";
	}

	@PostMapping("/searchProduto")
	public String searchProduto(@ModelAttribute("produto") Produto produto, Model model) {
		List<Produto> produtos = produtoService.searchProdutos(produto.getPartNumber());
		model.addAttribute("produtos", produtos);
		return "search-result";
	}

	@GetMapping("/showFormForUpdateProduto")
	public String showFormForUpdateProduct(@RequestParam("prodId") int theId, Model model) {

		// get the customer from the service
		Produto produto = produtoService.getProduto(theId);

		// set customer as a model attribute to pre-populate the form
		model.addAttribute("produto", produto);

		// send over to out form

		return "produto-form";
	}
}

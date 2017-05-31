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

import br.com.fuji.mvc.entity.Departamento;
import br.com.fuji.mvc.service.DepartamentoService;

@Controller
@RequestMapping("/departamento")
public class DepartamentoController {

	// injetar o departamentoService
	@Autowired
	private DepartamentoService departamentoService;

	@GetMapping("/list")
	public String listaDepartamento(Model model) {

		// recuperar data do DAO
		List<Departamento> departamentos = departamentoService.getDepartamentos();

		// adicionar ao modelo (para posterior envio a view)
		model.addAttribute("departamentos", departamentos);

		return "lista-departamentos";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {

		// create model attribute to bind form data
		Departamento departamento = new Departamento();

		theModel.addAttribute("departamento", departamento);

		return "departamento-form";
	}

	@PostMapping("/addDepto")
	public String saveCustomer(@ModelAttribute("departamento") Departamento departamento) {

		// save the customer using our service
		departamentoService.saveDepartamento(departamento);

		return "redirect:/departamento/list";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("deptoId") int id, Model theModel) {

		// get the depto from the service
		Departamento departamento = departamentoService.getDepartamento(id);

		// set customer as a model attribute to pre-populate the form
		theModel.addAttribute("departamento", departamento);

		// send over to out form

		return "departamento-form";
	}

	@GetMapping("/delete")
	public String delete(@RequestParam("deptoId") int id, Model theModel) {

		departamentoService.deleteDepartamento(id);

		return "redirect:/departamento/list";
	}
	
	@GetMapping("/")
	public String departamento(Model model) {

		return "departamentos";
	}
}

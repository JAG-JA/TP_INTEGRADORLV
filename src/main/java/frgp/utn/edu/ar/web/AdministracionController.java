package frgp.utn.edu.ar.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import frgp.utn.edu.ar.models.Cliente;
import frgp.utn.edu.ar.service.ClienteService;



@Controller
public class AdministracionController {
		   
	@Autowired
	private ClienteService clienteService;
	
	@RequestMapping("administracion")
	public String panelAdministracion(Model model) {
		 List<Cliente> sLisCliente = clienteService.findAll();
		 model.addAttribute("list", sLisCliente);
		 return "administrativo";
		
	}
	@ModelAttribute
	public void addAttributes(Model model) {
	    model.addAttribute("msg", "Welcome to the Netherlands!");
	}

}

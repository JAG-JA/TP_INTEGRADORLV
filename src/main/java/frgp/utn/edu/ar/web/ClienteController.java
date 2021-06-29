package frgp.utn.edu.ar.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import frgp.utn.edu.ar.models.Cliente;
import frgp.utn.edu.ar.service.ClienteService;


@Controller
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@RequestMapping("viewDelete/{id}")
	public String findClienteById(@PathVariable String id, Model model ) {
		
	  Cliente sCliente = clienteService.findById(Long.parseLong(id));
	  model.addAttribute("cliente", sCliente);
	  return "borrarCliente";
		
	}
	@RequestMapping("viewDelete/delete/{id}")
	public String delet(@PathVariable String id, Model model ) {
		clienteService.deleteById(Long.parseLong(id));
        return "administracion";
	}
	
}

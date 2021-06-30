package frgp.utn.edu.ar.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import frgp.utn.edu.ar.models.Cliente;
import frgp.utn.edu.ar.service.ClienteService;


@Controller
@ControllerAdvice
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
	public String delete(@PathVariable String id, Model model ) {
		Cliente sCliente  = clienteService.findById(Long.parseLong(id));
		clienteService.updateCliente(sCliente);
        return "administracion";
	}
	
	 @ModelAttribute
	  public void addAttributes(Model model) {
	       model.addAttribute("msg", "Welcome to the Netherlands!");
	  }
}

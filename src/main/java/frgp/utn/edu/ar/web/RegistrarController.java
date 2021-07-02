package frgp.utn.edu.ar.web;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import frgp.utn.edu.ar.service.LocalidadService;
import frgp.utn.edu.ar.models.Cliente;
import frgp.utn.edu.ar.models.Localidad;
import frgp.utn.edu.ar.service.ClienteService;

@Controller
@ControllerAdvice
public class RegistrarController {

	@Autowired
	private LocalidadService localidadService;

	@Autowired
	private ClienteService clienteService;
    
	@RequestMapping(value="/registrar")
	public String viewFormReg(Model model) {
    	Cliente cliente = new Cliente();
    	List<Localidad> sListLocalidad = localidadService.findAll();
       
    	List<String> sListSex = new ArrayList<String>();
        sListSex.add("Masculino");
        sListSex.add("Femenino");
        sListSex.add("!Binario");
        
        List<String> sListNacionalidad = new ArrayList<String>();
        sListNacionalidad.add("Argentino");
        sListNacionalidad.add("Congoleña");
        sListNacionalidad.add("Paraguaya");
        
        
   	    model.addAttribute("cliente", cliente);
   	    model.addAttribute("sComboLocalidades",sListLocalidad);
   	    model.addAttribute("sListSex",sListSex);
   	    model.addAttribute("sListNacionalidad",sListNacionalidad);
   	    
		return "registrar";
	}
	
	
   @RequestMapping("/save") 
   public String save(@ModelAttribute("cliente") Cliente cliente, BindingResult result ,Model model) {
	   
	   //si el cliente tiene ID tengo que actualizar y sino que siga creando.
	   
	   System.out.println(cliente.getNombre());
	   Cliente sCliente = clienteService.save(cliente);
	   model.addAttribute("cliente", sCliente);
	   model.addAttribute("cuenta", sCliente.getCuenta().get(0));
	   model.addAttribute("usr", sCliente.getUsuario());
	   model.addAttribute("localidad", sCliente.getLocalidad());
	   return "success";
   }
	
   @ModelAttribute
   public void addAttributes(Model model) {
	   List<Localidad> sListLocalidad = localidadService.findAll();
	   model.addAttribute("localidad", sListLocalidad);
       model.addAttribute("msg", "Welcome to the Netherlands!");
   }
	
	   
	
}

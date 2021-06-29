package frgp.utn.edu.ar.web;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.ui.ModelMapExtensionsKt;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.w3c.dom.NodeList;

import frgp.utn.edu.ar.service.LocalidadService;
import frgp.utn.edu.ar.models.Cliente;
import frgp.utn.edu.ar.models.Cuenta;
import frgp.utn.edu.ar.models.Usuario;
import frgp.utn.edu.ar.service.ClienteService;
import frgp.utn.edu.ar.service.UsuarioService;



@Controller
@ControllerAdvice
public class LoginController {

   @Autowired
   private UsuarioService usuarioService;
   
   @Autowired
   private ClienteService clienteService;
   
   @Autowired
   private LocalidadService localidadService;
	
   @RequestMapping(value="/login", method = RequestMethod.GET)
   public String viewFormLogin(Model model) {
	  
	   Usuario usuario = new Usuario();
	   model.addAttribute("usuario", usuario);
	   return "login";
	}
    
   @RequestMapping(value="/validar", method = RequestMethod.POST)
   public String validar(@ModelAttribute("usuario") Usuario usuario,BindingResult result, Model model){
	   
	  if(result.hasErrors() ){return "error";} 

	   Usuario usrValid = usuarioService.getUser(usuario);
	   if(usrValid == null) {return "error";}
	   if(usrValid.getRol().getIdRol() ==1 ) {
		     List<Cliente> sLisCliente = clienteService.findAll();
		     model.addAttribute("list", sLisCliente);
		   return "administrativo";
		}
	   Cliente sModel =  clienteService.findClienteByUsuario(usrValid.getIdUsuario());
	   model.addAttribute("cliente", sModel);
	   List<Cuenta> sListCuenta = sModel.getCuenta();
	   
	   model.addAttribute("sListCuenta", sListCuenta);
	   
	   return "cliente";
   }
 

}

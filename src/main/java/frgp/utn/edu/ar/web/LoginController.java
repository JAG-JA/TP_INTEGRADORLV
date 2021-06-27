package frgp.utn.edu.ar.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import frgp.utn.edu.ar.models.Cliente;
import frgp.utn.edu.ar.models.Usuario;
import frgp.utn.edu.ar.service.ClienteService;
import frgp.utn.edu.ar.service.UsuarioService;
import frgp.utn.edu.ar.service.impl.ClienteServiceImpl;

@Controller
public class LoginController {

   @Autowired
   private UsuarioService usuarioService;
   
   @Autowired
   private ClienteService clienteService;
	
   @RequestMapping("/login")
   public String viewFormLogin(Model model) {
	  
	   Usuario usuario = new Usuario();
	   model.addAttribute("usuario", usuario);
	   return "login";
	   
   }
    
   @RequestMapping("/validar")
   public String validar(@ModelAttribute("usuario") Usuario usuario, Model model){
	  	   
	   System.out.println("El usuario es "+ usuario.getUserName());
	   Usuario usrValid = usuarioService.getUser(usuario);
	   if(usrValid == null) 
			return "error";
	   
	   Cliente sModel =  clienteService.findClienteByUsuario(usrValid.getIdUsuario());
	   return "cliente";
   }
    
}

package ar.com.utn.integrador.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.com.utn.integrador.models.Cliente;
import ar.com.utn.integrador.models.Usuario;
import ar.com.utn.integrador.service.ClienteService;
import ar.com.utn.integrador.service.UsuarioService;
import ar.com.utn.integrador.service.impl.ClienteServiceImpl;

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

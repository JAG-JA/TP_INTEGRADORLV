package frgp.utn.edu.ar.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import frgp.utn.edu.ar.models.Cuenta;
import frgp.utn.edu.ar.models.Transferencia;
import frgp.utn.edu.ar.service.CuentaService;
import frgp.utn.edu.ar.service.TransferenciaService;

@Controller
public class TransferenciaController {	
	
	@Autowired 
	private CuentaService cuentaService;

	@Autowired 
	private TransferenciaService transferenciaService;
	
	@RequestMapping("/transfencia/{idcuenta}")
	public String viewTransferenciaForm(@PathVariable String idCuenta, Model model) {
		System.out.println("Id cuenta origen es " + idCuenta);
		Cuenta sCuentaOrigen = cuentaService.findById(Long.parseLong(idCuenta));
		model.addAttribute("cuentaOrigen", sCuentaOrigen);
		return "transferencia";
	}
	
	@RequestMapping("/generarTrx")
	public String generarTransferencia(@ModelAttribute("transferencia") Transferencia transferencia,BindingResult result, Model model) {
		
		Transferencia sTransferencia = transferenciaService.save(transferencia);
		
		return "transferencia_exitosa";
		
	}
	
}

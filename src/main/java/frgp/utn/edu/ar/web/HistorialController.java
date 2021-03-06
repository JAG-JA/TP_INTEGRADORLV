package frgp.utn.edu.ar.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import frgp.utn.edu.ar.models.Cuenta;
import frgp.utn.edu.ar.models.Movimiento;
import frgp.utn.edu.ar.service.CuentaService;
import frgp.utn.edu.ar.service.HistorialService;

@Controller
public class HistorialController {

	@Autowired
	private HistorialService  historialService;
	
	@Autowired 
	private CuentaService cuentaService;
	
	@RequestMapping("/historial/{cuenta}")
	 //public String viewHistorialForm(@ModelAttribute("movimiento") Movimiento movimiento,  @PathVariable String cuenta, BindingResult result, Model model) {
	public String viewHistorialForm(@PathVariable String cuenta,Model model) {
		 System.out.println("la cuenta seleccionada es " + cuenta);
		 List<Movimiento> sList = historialService.findAllByCuenta(cuenta);
		 Cuenta sCuenta = cuentaService.findById(Long.parseLong(cuenta));
		 model.addAttribute("movimiento", sList);
		 model.addAttribute("cuenta", sCuenta);
		 return "historial";		 
	 }	

	 @ModelAttribute
	 public void addAttributes(Model model) {
		 Movimiento movimiento = new Movimiento();
		 model.addAttribute("movimiento", movimiento);
		 
	 }
}

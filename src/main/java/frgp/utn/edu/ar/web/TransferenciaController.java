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
import org.springframework.web.bind.annotation.RequestMethod;

import frgp.utn.edu.ar.dto.TransferenciaDto;
import frgp.utn.edu.ar.models.Cuenta;
import frgp.utn.edu.ar.models.Transferencia;
import frgp.utn.edu.ar.models.Usuario;
import frgp.utn.edu.ar.service.CuentaService;
import frgp.utn.edu.ar.service.TransferenciaService;

@Controller
public class TransferenciaController {
 
	@Autowired
	private CuentaService cuentaService;
	
	@Autowired
	private TransferenciaService  transferencia;

	@RequestMapping("/transferencia/{idCuenta}")
	public String viewFormTransferencia(@PathVariable("idCuenta") String idCuenta, Model model) {
		
		Cuenta sCuenta = new Cuenta();
		sCuenta =  cuentaService.findById(Long.parseLong(idCuenta));
		model.addAttribute("cuentaOrigen", sCuenta);
		TransferenciaDto transferenciaDto  =  new TransferenciaDto();
		transferenciaDto.setCuentaOrigen(sCuenta.getNroCuenta());
		model.addAttribute("transferenciaDto",transferenciaDto);
		
	    //agregado para mostrar el usuario logueado
	    model.addAttribute("usrLogin", sCuenta.getCliente().getUsuario().getUserName());
		
		return  "transferencia";
		
	}
	
	 @RequestMapping(value="transferencia/transferenciapost", method = RequestMethod.POST)
	 public String save(@ModelAttribute("transferenciaDto") TransferenciaDto transferenciaDto, BindingResult result, Model model) {
		 
		 Cuenta sCuenta = new Cuenta();
	
		 sCuenta = cuentaService.findByName(transferenciaDto.getCuentaOrigen());
			
		if (Float.parseFloat(transferenciaDto.getImporte()) > sCuenta.getSaldo() )
		 {
			 return "error_trans";
		 }
		 transferencia.save(transferenciaDto);
		 
		 model.addAttribute("idcuenta",sCuenta.getIdCuenta());
		 return "successTrans";
		 
	}
	
	 @ModelAttribute
	 public void addAttributes(Model model) {
		 Transferencia transferencia = new Transferencia();
		 model.addAttribute("transferencia", transferencia);
		 
	 }
	
}

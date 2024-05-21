package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormController {
	
	//Metodo ue devuelve la pagina index luego de ingresar por primera vez//
		@GetMapping("/formulario")
		public String getIndexPage() {
			
			return "form-cliente";
				
		}
		
	

}

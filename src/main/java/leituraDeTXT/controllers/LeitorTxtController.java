package leituraDeTXT.controllers;

import java.text.NumberFormat;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import leituraDeTXT.services.ClienteServices;
import leituraDeTXT.services.FuncionarioServices;
import leituraDeTXT.services.VendaService;

@Controller
public class LeitorTxtController {
	
	@GetMapping("/")
	public ModelAndView paginaDoTxt() {
		
		//gerais
		Locale l = new Locale("pt","BR");
		NumberFormat nf = NumberFormat.getCurrencyInstance(l);
		
		//retornando total de funcionários, clientes e vendas, e enviando para a view "index"
		Integer totalDeFuncionarios = FuncionarioServices.totalDeFuncionarios();
		Integer totalDeClientes = ClienteServices.totalDeClientes();
		Integer totalDeVendas = VendaService.totalDeVendas();
		
		
		//retorna o valor total das vendas, converte para string e aplica a formatação do Real
		String valorTotalDeVendas = nf.format(VendaService.getValorTotalDeVendas());
		
		ModelAndView mv = new ModelAndView("index");
		
		mv.addObject("totalFuncionarios", totalDeFuncionarios);
		mv.addObject("totalClientes", totalDeClientes);
		mv.addObject("totalVendas", totalDeVendas);
		mv.addObject("totalValorVendas", valorTotalDeVendas);
		
		return mv;
	}
	

}

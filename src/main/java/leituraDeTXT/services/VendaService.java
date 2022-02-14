package leituraDeTXT.services;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import leituraDeTXT.entities.Venda;

@Service
public class VendaService {
	public static double valorTotalDeVendas;
	
	public static String[] mesesDeVendas;
	
	
	public static List<Venda> listVendas = new ArrayList<Venda>();
	
	public static List<Venda> getListVendas() {
		return listVendas;
	}

	public static void setListVendas(List<Venda> listVendas) {
		VendaService.listVendas = listVendas;
	}
	
	
	public static double getValorTotalDeVendas() {
		return valorTotalDeVendas;
	}

	public static void setValorTotalDeVendas(double valorTotalDeVendas) {
		VendaService.valorTotalDeVendas += valorTotalDeVendas;
	}

	public static void novaVenda(String linhaDeVenda) {
		
		String[] vetorLinhaVenda = linhaDeVenda.split(Pattern.quote("|"));
		
		String idVenda = vetorLinhaVenda[1];
		
		String idFuncionarioVenda = vetorLinhaVenda[2];
		
		String idClienteVenda = vetorLinhaVenda[3];
		
		Double valorVenda = Double.parseDouble(vetorLinhaVenda[4].replace("," , "."));
		
		//aproveita o loop para iterar o valor total das vendas
		setValorTotalDeVendas(valorVenda);
		
		String dataVenda = vetorLinhaVenda[5];
		
		
		
		Venda venda = new Venda(idVenda, idFuncionarioVenda, idClienteVenda, valorVenda, dataVenda);
		
		listVendas.add(venda);
	}
	
	public static Integer totalDeVendas() {
		return listVendas.size();
		
	}
	
	
	

}

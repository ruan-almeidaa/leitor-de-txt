package leituraDeTXT.services;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import leituraDeTXT.entities.Cliente;
import leituraDeTXT.entities.Funcionario;

@Service
public class ClienteServices {
	
	public static List<Cliente> listCliente = new ArrayList<Cliente>();
	
	public static List<Cliente> getListCliente() {
		return listCliente;
	}

	public static void setListCliente(List<Cliente> listCliente) {
		ClienteServices.listCliente = listCliente;
	}

	public static void novoCliente(String linhaDeCliente) {
		
		String[] vetorLinhaCliente = linhaDeCliente.split(Pattern.quote("|"));
		
		String idCliente = vetorLinhaCliente[1];
		
		String nomeCliente = vetorLinhaCliente[2];
		
		String nascimentoCliente = vetorLinhaCliente[3];
		
		Cliente cliente = new Cliente (idCliente, nomeCliente, nascimentoCliente);
		
		listCliente.add(cliente);
	}
		
	public static Integer totalDeClientes() {
		return listCliente.size();
		
	}

}

package leituraDeTXT.services;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import leituraDeTXT.entities.Funcionario;

@Service
public class FuncionarioServices {
	
	public static List<Funcionario> listFuncionario = new ArrayList<Funcionario>();


	public static List<Funcionario> getListFuncionario() {
		return listFuncionario;
	}

	public static void setListFuncionario(List<Funcionario> listFuncionario) {
		FuncionarioServices.listFuncionario = listFuncionario;
	}

	public static void novoFuncionario(String linhaDeFuncionario) {
		
		String[] vetorLinhaFuncionario = linhaDeFuncionario.split(Pattern.quote("|"));
		
		String idFuncionario = vetorLinhaFuncionario[1];
		
		String nomeFuncionario = vetorLinhaFuncionario[2];
		
		String contratacaoFuncionario = vetorLinhaFuncionario[3];
		
		Funcionario funcionario = new Funcionario(idFuncionario, nomeFuncionario, contratacaoFuncionario);
		
		listFuncionario.add(funcionario);
	}
	

	public static Integer totalDeFuncionarios() {
		return listFuncionario.size();
		
	}
	
}

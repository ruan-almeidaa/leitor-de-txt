package leituraDeTXT;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import leituraDeTXT.entities.Cliente;
import leituraDeTXT.entities.Funcionario;
import leituraDeTXT.entities.Venda;
import leituraDeTXT.services.ClienteServices;
import leituraDeTXT.services.FuncionarioServices;
import leituraDeTXT.services.VendaService;

@SpringBootApplication
public class LeitorTxtApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeitorTxtApplication.class, args);
		
		
		//alterar aqui o caminho do arquivo que irá ser lido
		String caminhoDoArquivo = "C:\\Users\\ASUS\\Documents\\workspace-spring-tool-suite-4-4.13.1.RELEASE\\leitorTXT\\arquivo\\dados.txt";

		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			
			//instânciando o FileReader e BufferedReader para ler linha a linha do arquivo
			fr = new FileReader(caminhoDoArquivo);
			br = new BufferedReader(fr);
			
			//le a primeira linha do arquivo antes de entrar no loop
			String linha = br.readLine();
			
			do {
				
				//pega o primeiro caracter da linha, validando se for 0 é um funcionário, se for 1 é um cliente, e se for 2 é uma venda. Após validar, chama o método correspondente para instanciar o objeto
				if(linha.substring(0, 1).equals("0")) {
					
					FuncionarioServices.novoFuncionario(linha);
					
				}else if(linha.substring(0, 1).equals("1")) {
					
					ClienteServices.novoCliente(linha);
					
				}else if(linha.substring(0, 1).equals("2")) {
					VendaService.novaVenda(linha);
				}
								
				//le a próxima linha do arquivo, se não existir mais linhas, a linha receberá null e o loop será interrompido.
				linha = br.readLine();
				
			}while(linha != null);
			

		} catch (IOException e) {
			
			System.out.println("error: " + e.getMessage());
			
		}
		
		finally {
			//bloco finally para encerrar o FileReader e BufferedReader, com try catch caso não seja possível encerrá-los.
			try {
				br.close();
				fr.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}

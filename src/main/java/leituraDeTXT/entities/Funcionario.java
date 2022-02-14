package leituraDeTXT.entities;

public class Funcionario {

	private String idFuncionario;
	
	private String nomeFuncionario;
	
	private String contratacaoFuncionario;
	
	public Funcionario() {
		
	}

	public Funcionario(String idFuncionario, String nomeFuncionario, String contratacaoFuncionario) {
		super();
		this.idFuncionario = idFuncionario;
		this.nomeFuncionario = nomeFuncionario;
		this.contratacaoFuncionario = contratacaoFuncionario;
	}

	public String getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(String idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public String getContratacaoFuncionario() {
		return contratacaoFuncionario;
	}

	public void setContratacaoFuncionario(String contratacaoFuncionario) {
		this.contratacaoFuncionario = contratacaoFuncionario;
	}


}

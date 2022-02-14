package leituraDeTXT.entities;

public class Cliente {
	
	private String idCliente;
	
	private String nomeCliente;
	
	private String nascimentoCliente;

	public Cliente() {
		
	}

	public Cliente(String idCliente, String nomeCliente, String nascimentoCliente) {
		super();
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.nascimentoCliente = nascimentoCliente;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNascimentoCliente() {
		return nascimentoCliente;
	}

	public void setNascimentoCliente(String nascimentoCliente) {
		this.nascimentoCliente = nascimentoCliente;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nomeCliente=" + nomeCliente + ", nascimentoCliente="
				+ nascimentoCliente + "]";
	}
	
	
	

}

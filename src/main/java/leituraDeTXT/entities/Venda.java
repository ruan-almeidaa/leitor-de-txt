package leituraDeTXT.entities;

public class Venda {
	
	private String idVenda;
	
	private String idFuncionarioVenda;
	
	private String idClienteVenda;
	
	private Double valorVenda;
	
	private String dataVenda;

	public Venda() {

	}

	public Venda(String idVenda, String idFuncionarioVenda, String idClienteVenda, Double valorVenda,
			String dataVenda) {
		super();
		this.idVenda = idVenda;
		this.idFuncionarioVenda = idFuncionarioVenda;
		this.idClienteVenda = idClienteVenda;
		this.valorVenda = valorVenda;
		this.dataVenda = dataVenda;
	}

	public String getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(String idVenda) {
		this.idVenda = idVenda;
	}

	public String getIdFuncionarioVenda() {
		return idFuncionarioVenda;
	}

	public void setIdFuncionarioVenda(String idFuncionarioVenda) {
		this.idFuncionarioVenda = idFuncionarioVenda;
	}

	public String getIdClienteVenda() {
		return idClienteVenda;
	}

	public void setIdClienteVenda(String idClienteVenda) {
		this.idClienteVenda = idClienteVenda;
	}

	public Double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(Double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public String getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}

	@Override
	public String toString() {
		return "Venda [idVenda=" + idVenda + ", idFuncionarioVenda=" + idFuncionarioVenda + ", idClienteVenda="
				+ idClienteVenda + ", valorVenda=" + valorVenda + ", dataVenda=" + dataVenda + "]";
	}
	
	
	

}

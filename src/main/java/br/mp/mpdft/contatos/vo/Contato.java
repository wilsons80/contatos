package br.mp.mpdft.contatos.vo;

public class Contato {

	private Integer id;
	private String nome;
	private String telefone;
	private String data;
	private String cor;
	
	private Operadora operadora;
	
	public Contato() {
	}
	

	public Contato(Integer id , String nome, String telefone, String data, String cor, Operadora operadora) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.cor = cor;
		this.data = data;
		this.operadora = operadora;
		
	}
	
	
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}


	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Operadora getOperadora() {
		return operadora;
	}

	public void setOperadora(Operadora operadora) {
		this.operadora = operadora;
	}


	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", telefone=" + telefone + ", data=" + data + ", cor=" + cor
				+ ", operadora=" + operadora + "]";
	}
	
	
}

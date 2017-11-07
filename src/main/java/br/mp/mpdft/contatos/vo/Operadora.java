package br.mp.mpdft.contatos.vo;

public class Operadora {
	
	private String nome;
	private Integer codigo;
	private String categoria;
	private Double preco;
	private Double precoComImposto;
	
	public Operadora() {
	}

	
	public Operadora(String nome, Integer codigo, String categoria, Double preco) {
		this.nome = nome;
		this.codigo = codigo;
		this.categoria = categoria;
		this.preco = preco;
	}


	public Double getPrecoComImposto() {
		return precoComImposto;
	}

	public void setPrecoComImposto(Double precoComImposto) {
		this.precoComImposto = precoComImposto;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	@Override
	public String toString() {
		return "Operadora [nome=" + nome + ", codigo=" + codigo + ", categoria=" + categoria + ", preco=" + preco + "]";
	}

	
	
}

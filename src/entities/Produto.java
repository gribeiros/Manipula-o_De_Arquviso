package entities;

public class Produto {
	
	String Nome;
	Double Preco;
	Integer Quantidade;
	
	public Produto() {}

	public Produto(String nome, Double preco, Integer quantidade) {
		Nome = nome;
		Preco = preco;
		Quantidade = quantidade;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Double getPreco() {
		return Preco;
	}

	public void setPreco(Double preco) {
		Preco = preco;
	}

	public Integer getQuantidade() {
		return Quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		Quantidade = quantidade;
	}
	
	public Double precoUni() {
		return Preco*Quantidade;
	}
	
}

package aggregate;

public class MenuItem {

	private String nome;
	private String descricao;
	private boolean isVEgetariano;
	private double preco;
	
	
	
	public MenuItem(String nome, String descricao, boolean isVEgetariano, double preco) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.isVEgetariano = isVEgetariano;
		this.preco = preco;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isVEgetariano() {
		return isVEgetariano;
	}
	public void setVEgetariano(boolean isVEgetariano) {
		this.isVEgetariano = isVEgetariano;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

}

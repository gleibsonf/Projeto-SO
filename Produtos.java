
public class Produtos {
	
	private String nome;
	private String categoria;
	private double preco;
	private int codigo;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCategoria(){
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		if (preco > 0) {
			this.preco = preco;
			System.out.println("Produto cadastrado com sucesso!");
		}else {
			System.out.println("Produto não cadastrado");
		}
		
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}

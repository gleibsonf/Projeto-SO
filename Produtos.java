package PROJETO;

public class Produto {
	private int codProduto;
    private String nomeProduto;
    private String marcaProduto;
    private double valorProduto;
    private int quantidadeProduto;
    private String categoriaProduto;
	private double valorTotal;


    public int getCodProduto() {
       
        return codProduto;

    }
    public void setCodProduto(int codProduto) {
        
        this.codProduto = codProduto;

    }


    public String getNomeProduto() {

        return nomeProduto;

    }
    public void setNomeProduto(String nomeProduto) {

        this.nomeProduto = nomeProduto;

    }


    public String getMarcaProduto() {

        return marcaProduto;

    }
    public void setMarcaProduto(String marcaProduto) {
        
        this.marcaProduto = marcaProduto;

    }


    public double getValorProduto() {
        
        return valorProduto;

    }
    
    public void setValorProduto(double valorProduto) {
        
        if (valorProduto <= 0)

        	System.out.println("Erro valor do produto não pode ser menor que zero!");
        
        else

        this.valorProduto = valorProduto;
    }


    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }
    public void setQuantidadeProduto(int quantidadeProduto) {
        if (quantidadeProduto > 0)
        this.quantidadeProduto = quantidadeProduto;
        else
            System.out.println("Erro o produto não pode ser menor ou igual zero");
    }


    public String getCategoriaProduto() {
        return categoriaProduto;
    }
    public void setCategoriaProduto(String categoriaProduto) {
    	if (this.valorProduto > 25.50)
    		this.categoriaProduto = "A";
    	if (this.valorProduto < 25.50 && this.valorProduto > 15.50)
    		this.categoriaProduto = "B";
    	if (this.valorProduto < 15.50 && this.valorProduto > 7.50)
    		this.categoriaProduto = "C";
    	else
    		this.categoriaProduto = "D";
        this.categoriaProduto = categoriaProduto;
    }
    
    public double getValorTotal() {
    	this.valorTotal = quantidadeProduto * valorProduto;
		return valorTotal;
	}
    public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
}


package PROJETO;



public class ControleDeEstoque {
    private Fornecedor fornecedor;
    private Produto produto;
    private String dataEntrada;
    private String dataSaida;
    private double dinheiroEstoque;
    private static int produtoEstoque;


    ControleDeEstoque(){
        this.fornecedor = fornecedor;
        this.produto = produto;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.dinheiroEstoque= 100000;
    }

    public void addProduto(Produto produto){
    	this.produto = produto;
    	this.produtoEstoque++; 

    }
    
    public String getDataEntrada() {
		return dataEntrada;
	}
    
    public void setDataEntrada(String dataEntrada) {
    	if (dataEntrada.length() == 10)
            this.dataEntrada = dataEntrada;
            else
                System.out.println("Erro a data de entrada deve seguir este formato(XX/XX/XXXX)");
	}
    
    public String getDataSaida() {
		return dataSaida;
	}
    
    public void setDataSaida(String dataSaida) {
    	if (dataSaida.length() == 10)
    		this.dataSaida = dataSaida;
            else
                System.out.println("Erro a data de saída deve seguir este formato(XX/XX/XXXX)");
	}
    
    public double getDinheiroEstoque() {
		return dinheiroEstoque;
	}
    
    public void setDinheiroEstoque(double dinheiroEstoque) {
    	if (this.dinheiroEstoque < Produto.getValorTotal())
    		System.out.println("Você não tem dinhero suficiente em estoque!");
    	else
		this.dinheiroEstoque = dinheiroEstoque;
	}



}

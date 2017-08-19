package IFPE;

import javax.xml.crypto.Data;

public class ControleDeEstoque {
    private String codProduto;
    private String fornecedor;
    private String nomeProduto;
    private double valorUnitarioPro;
    private double valorTotalPro;
    private int quantidadePro;
    private Data dataDeEntrada;
    private String categoriaPro;
    private double totalEstoque;



    // Codigo do Produto.

    public String getCodProduto() {
        return codProduto;
    }
    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }
    //Fornecedor.

    public String getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
    //Nome do Produto.

    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    // Valor unitario do produto

    public double getValorUnitarioPro() {
        return valorUnitarioPro;
    }
    public void setValorUnitarioPro(double valorUnitarioPro) {
        if (valorUnitarioPro < 0.0)
            System.out.println("Valor negativo não é aceito porfavor coloque o valor certo!");
        else
            this.valorUnitarioPro = valorUnitarioPro;

    }
    //Valor total do produto.

    public double getValorTotalPro() {
        this.valorTotalPro = quantidadePro * valorUnitarioPro;
        return valorTotalPro;
    }
    public void setValorTotalPro(double valorTotalPro) {
        if (valorTotalPro == quantidadePro * valorUnitarioPro)
        this.valorTotalPro = valorTotalPro;
        else
            System.out.println("Erro Valor incorreto!");
    }
    //Quantidade do produto.

    public int getQuantidadePro() {
        return quantidadePro;
    }
    public void setQuantidadePro(int quantidadePro) {
        if (quantidadePro <= 0)
            System.out.println("Erro digite a quantidade correta!");
        else
        this.quantidadePro = quantidadePro;
    }
    // Data de entrada.

    public Data getDataDeEntrada() {
        return dataDeEntrada;
    }
    public void setDataDeEntrada(Data dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }
    // Categoria do Produto.
    public String getCategoriaPro() {
        return categoriaPro;
    }
    public void setCategoriaPro(String categoriaPro) {
        this.categoriaPro = categoriaPro;
    }
    //Total em estoque.

    public double getTotalEstoque() {
        this.totalEstoque = valorTotalPro - totalEstoque;
        return totalEstoque;
    }
    public void setTotalEstoque(double totalEstoque) {
        if (totalEstoque <= 0 )
            System.out.println("Seu dinheiro em estoque acabou");
        else
        this.totalEstoque = totalEstoque;
    }
}

package Projeto;



public class Programa {

	public static void main(String[] args) {
		
		Produto p = new Produto();
		p.setCodProduto(1345);
		p.setNomeProduto("Carro");
		p.setMarcaProduto("Fiat");
		p.setQuantidadeProduto(10);
		p.setValorProduto(50.0);
		
	
	
		
		Fornecedor f = new Fornecedor();
		f.setNome("Linx");
		f.setCnpj("22.555.000/0001-11");
		f.setEmail("Jonas@gmail.com");
		f.setLote("12/07/2017");
		f.setTelefone("081 98835-9262");
		

		
		
		
		ControleDeEstoque ce = new ControleDeEstoque(f, p);
		ce.setDinheiroEstoque(200.0);
		ce.setDataSaida("15/05/2017");
		ce.setVender(2);
		ce.setEscolhaProduto(1343);
		System.out.println("Codigo do Produto: " + ce.getEscolhaProduto());
		System.out.println("Nome do Produto: " + p.getNomeProduto());
		System.out.println("Nome do Fornecedor: " + f.getNome());
		System.out.println("Dinheiro em Estoque: " + ce.getDinheiroEstoque());
		System.out.println("Data de Entrada: " + ce.getDataEntrada());
		System.out.println("Data de Saida: " + ce.getDataSaida());
		System.out.println("Valor atualizado do estoque: " + ce.getNovoSaldo());
		

	}


}

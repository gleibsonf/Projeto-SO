package Projeto;



public class Programa {

	public static void main(String[] args) {
		
		Produto p[] = new Produto[10];
		
		p[0].setCodProduto(1234);
		p[0].setNomeProduto("Carro Palio");
		p[0].setMarcaProduto("Fiat");
		p[0].setQuantidadeProduto(100);
		p[0].setValorProduto(50000.00);
		
		p[1].setCodProduto(2234);
		p[1].setNomeProduto("Carro new Fiesta");
		p[1].setMarcaProduto("Ford");
		p[1].setQuantidadeProduto(200);
		p[1].setValorProduto(53000.00);
		
		p[2].setCodProduto(3234);
		p[2].setNomeProduto("Carro HB 20");
		p[2].setMarcaProduto("Hyundai");
		p[2].setQuantidadeProduto(200);
		p[2].setValorProduto(44000.00);
		
		p[3].setCodProduto(4234);
		p[3].setNomeProduto("Carro Classic");
		p[3].setMarcaProduto("Chevrolet");
		p[3].setQuantidadeProduto(150);
		p[3].setValorProduto(22000.00);
		
		p[4].setCodProduto(4234);
		p[4].setNomeProduto("Carro Fox");
		p[4].setMarcaProduto("Volkswagen");
		p[4].setQuantidadeProduto(70);
		p[4].setValorProduto(42000.00);
		
		Fornecedor f[] = new Fornecedor[10];
		
		f[0].setNome("Fiat");
		f[0].setCnpj("00.000.0000/0001-00");
		f[0].setTelefone("81 997133813");
		f[0].setEmail("fiat@gmail.com");
		
		f[1].setNome("Ford");
		f[1].setCnpj("00.000.0000/0002-00");
		f[1].setTelefone("81 98454-5415");
		f[1].setEmail("ford@gmail.com");
		
		f[2].setNome("Hyunday");
		f[2].setCnpj("00.000.0000/0003-00");
		f[2].setTelefone("81 99453-3813");
		f[2].setEmail("hyunday@gmail.com");
		
		f[3].setNome("Chevrolet");
		f[3].setCnpj("00.000.0000/0004-00");
		f[3].setTelefone("81 99713-3813");
		f[3].setEmail("chevrolet@gmail.com");
		
		f[4].setNome("Volkswagen");
		f[4].setCnpj("00.000.0000/0005-00");
		f[4].setTelefone("81 99713-4853");
		f[4].setEmail("volkswagen@gmail.com");
		
		ControleDeEstoque ce = new ControleDeEstoque(f, p);
		
		ce.setDinheiroEstoque(20000.0);
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

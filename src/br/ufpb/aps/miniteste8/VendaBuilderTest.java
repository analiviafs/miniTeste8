package br.ufpb.aps.miniteste8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VendaBuilderTest {

	@Test
	public void testBuilder() {
		Produto banana = new Produto("banana maçã",1.00);
		Produto ovo = new Produto("ovo",2.00);
		Venda venda = new VendaBuilder()
				.Data("10/03/20")
				.ClientePf("Jose", "0000")
				.item(3, banana)
				.item(5,ovo)
				.Build();
		
		
	}
	
	@Test
	void TestMeuTeste1() {
		Produto Abacaxi = new Produto("Abacaxi",5.00);
		Produto Limao = new Produto("Limao",2.00);
		Produto Uva = new Produto("Uva",3.00);
		Venda venda = new VendaBuilder()
				.Data("13/03/2020")
				.ClientePf("Marcos", "1111")
				.item(1, Abacaxi)
				.item(2, Limao)
				.item(10, Uva)
				.Build();
	}
	
	@Test
	void TestMeuTeste2() {
		Produto TV = new Produto("TV",99.00);
		Produto Radio = new Produto("Radio",23.00);
		Produto Sanduicheira = new Produto("Sanduicheira",33.00);
		Venda venda = new VendaBuilder()
				.Data("13/03/2020")
				.ClientePf("João", "2222")
				.item(1, TV)
				.item(1, Radio)
				.item(1, Sanduicheira)
				.Build();
	}

}


public class Principal {

	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza();
		Pizza p3 = new Pizza();

		p1.adicionaIngrediente("Queijo");
		p1.adicionaIngrediente("Tomate");
		p1.adicionaIngrediente("Oregano");
		
		p2.adicionaIngrediente("Queijo");
		p2.adicionaIngrediente("Tomate");
		p2.adicionaIngrediente("Oregano");
		
		p3.adicionaIngrediente("Queijo");
		p3.adicionaIngrediente("Tomate");
		p3.adicionaIngrediente("Oregano");
		
		carrinho.adicionarAoCarrinho(p1);
		carrinho.adicionarAoCarrinho(p2);
		carrinho.adicionarAoCarrinho(p3);
		
		System.out.println("Valor total do Carrinho é de R$"+carrinho.getPrecoTotal()+" !");
		
		Pizza.listaDeIngredientes();
	}
}

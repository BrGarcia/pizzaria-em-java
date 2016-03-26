import java.util.*;

public class CarrinhoDeCompras {
	public double precoTotal;
	public int qtdPizzas;
	
	List<Pizza> pedido = new ArrayList<Pizza>();
	
	public void adicionarAoCarrinho(Pizza p){
		if(p.getQtdIngrediente() > 0){
			pedido.add(p);
			precoTotal += p.getPreco();
		}
		else{
			System.out.println("Pizza sem ingredientes \n");
		}
	}
	public double getPrecoTotal() {
		return precoTotal;
	}

	public int getQtdPizzas() {
		return qtdPizzas;
	}
	public void setQtdPizzas(int qtdPizzas) {
		this.qtdPizzas = qtdPizzas;
	}
	

}

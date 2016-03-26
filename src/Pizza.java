import java.util.HashMap;

public class Pizza {
	public int qtdIngrediente;
	public static HashMap<String, Integer> ingredientes = new HashMap<String, Integer>();

    
	public double getPreco() {
		if(this.qtdIngrediente == 0){
			return 0;
		}else if(this.qtdIngrediente <= 2){
			return 15;
		}else if(this.qtdIngrediente <= 5){
			return 20;
		}else if(this.qtdIngrediente > 5){
			return 25;
		}
		return 0;
	}
	public int getQtdIngrediente() {
		return qtdIngrediente;
	}

	public void adicionaIngrediente(String ingrediente){
		qtdIngrediente++;
		contabilizaIngrediente(ingrediente);
	}

	private void contabilizaIngrediente(String ingrediente) {
		//SE O INGREDIENTE JA ESTA NA LISTA ADICIONA 1 A SUA QUANTIDADE E REINSIRA NO HASMAP
		if(ingredientes.containsKey(ingrediente)){ 
			int qtd = ingredientes.get(ingrediente).intValue(); //recupera a valor da chave "ingrediente" e adiciona em qtd
			qtd++; //incrementa qtd pois o ingrediente foi usado novamente
			ingredientes.put(ingrediente, qtd++); 	//adiciona o ingrediente junto com seu novo valor
			}
		//SE O INGREDIENTE NÃO NA LISTA ADICIONE-O SOMANDO +1
		else{					
			ingredientes.put(ingrediente, 1);					
		}
	}
	public static void listaDeIngredientes(){
		System.out.println("Queijo: "+ ingredientes.get("Queijo") + " \n ");
		System.out.println("Tomate: "+ ingredientes.get("Tomate") + " \n ");
		System.out.println("Oregano: "+ ingredientes.get("Oregano") + " \n ");
	}
}
	

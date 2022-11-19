package encontro10;

import java.util.Stack;

public class pilhas {
	
	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		pilha.push("joão");
		pilha.push("Maria");
		pilha.push("Bernado");
		while(!pilha.empty()) {
			System.out.println(pilha.pop());
		}
	}
}

package controller;

public class FibonacciController {
	public FibonacciController() {
		super();
	}
	
	public int getFibonacci(int n) {
		// se N for igual 1 ou 2 retorna 1 pois é o valor das duas primeiras posições
		if(n == 1 || n == 2) {
			return 1;
		}else {
			// retorna a soma dois dois ultimos números da série fibonacci
			return getFibonacci(n-1) + getFibonacci(n-2);
		}
	}
}

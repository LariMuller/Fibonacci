package view;

import controller.FibonacciController;
import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		FibonacciController fib = new FibonacciController();
		int n = 0;
		do {
			n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número entre 1 e 20 para receber o valor da série Fibonacci: "));
			if(n < 1 || n > 20) {
				JOptionPane.showMessageDialog(null, "Número Inválido");
			}
		}while(n < 1 || n > 20);
		JOptionPane.showMessageDialog(null, "O "+ n +"º número da série Fibonacci é " + fib.getFibonacci(n));
	}
}

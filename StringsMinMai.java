/* Exercício 16.10: StringsMinMai.java
 * @author Edson F.
 * Escreva um aplicativo que insere uma linha de texto e gera duas vezes a saída
 * do texto - uma vez em letras maiúsculas e uma vez em letras minúsculas. 
 */

import java.util.Scanner;

public class StringsMinMai {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
		String entrada = scanner.nextLine();
		
		System.out.println(entrada.toUpperCase());
		System.out.println(entrada.toLowerCase());
	}
}
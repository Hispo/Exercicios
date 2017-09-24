/* Exercício 16.4: ComparandoPartesDeStrings.java
 * @author Edson F.
 * Escreva um aplicativo que utiliza o método String regionMatches para comparar
 * duas entradas de strings pelo usuário. O aplicativo deve inserir o número de
 * caracteres que será comparado e o índici inicial de comparação. O aplicativo
 * deve declarar se as strings são iguais. Ignore a distinção entra maiúsculas
 * e minúsculas dos caracteres ao realizar a comparação.
 */ 

import java.util.Scanner;

public class ComparandoPartesDeStrings {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("String 1: ");
		String string1 = scanner.nextLine();
		
		System.out.print("String 2: ");
		String string2 = scanner.nextLine();
		
		// 1º argumento ignora maiúsculas e minúsculas
		// 2º argumento índice inicial
		// 3º argumento string a ser comparada
		// 4º argumento inicia da comparação
		// 5º argumento número de caracteres a comparar
		if(string1.regionMatches(true, 0, string2, 0, 3)) 
			System.out.println("Primeiros 3 caracteres são iguais.");
		else
			System.out.println("Primeiros 3 caracteres são diferentes.");
	}
}
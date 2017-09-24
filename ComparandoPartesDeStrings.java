/* Exerc�cio 16.4: ComparandoPartesDeStrings.java
 * @author Edson F.
 * Escreva um aplicativo que utiliza o m�todo String regionMatches para comparar
 * duas entradas de strings pelo usu�rio. O aplicativo deve inserir o n�mero de
 * caracteres que ser� comparado e o �ndici inicial de compara��o. O aplicativo
 * deve declarar se as strings s�o iguais. Ignore a distin��o entra mai�sculas
 * e min�sculas dos caracteres ao realizar a compara��o.
 */ 

import java.util.Scanner;

public class ComparandoPartesDeStrings {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("String 1: ");
		String string1 = scanner.nextLine();
		
		System.out.print("String 2: ");
		String string2 = scanner.nextLine();
		
		// 1� argumento ignora mai�sculas e min�sculas
		// 2� argumento �ndice inicial
		// 3� argumento string a ser comparada
		// 4� argumento inicia da compara��o
		// 5� argumento n�mero de caracteres a comparar
		if(string1.regionMatches(true, 0, string2, 0, 3)) 
			System.out.println("Primeiros 3 caracteres s�o iguais.");
		else
			System.out.println("Primeiros 3 caracteres s�o diferentes.");
	}
}
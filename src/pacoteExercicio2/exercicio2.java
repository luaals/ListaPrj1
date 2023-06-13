package pacoteExercicio2;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade;
		 Scanner entrada = new Scanner(System.in);
		System.out.println("Qual sua idade?");
		idade = entrada.nextInt();
		if (idade>=18)
		{
		System.out.println("Maior de idade");
		}
		else{
		System.out.println("Menor de idade");
	}
	}
}

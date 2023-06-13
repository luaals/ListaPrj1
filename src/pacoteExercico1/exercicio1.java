package pacoteExercico1;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A1;
		int A2;
		int med;
	    Scanner entrada = new Scanner(System.in);
		 System.out.println("Primeira avaliação: ");
		 A1 = entrada.nextInt();
		 System.out.println("Segunda avaliação: ");
		 A2 = entrada.nextInt();
		med=(A1+A2)/2;
		if (med>=7){
		System.out.println("APROVADO");
		}
		else{
			 System.out.println("REPROVADO");

	}
	}
}

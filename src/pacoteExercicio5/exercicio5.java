package pacoteExercicio5;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ve;
		int np;
		int sal;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o valor do empréstico: ");
		 ve = entrada.nextInt();
		 System.out.print("Informe o número de parcelas: ");
		 np = entrada.nextInt();
		System.out.print("Informe seu salário: ");
		 sal = entrada.nextInt();
		if (ve/np<=sal*0.3){
			System.out.print("EMPRÉSTIMO APROVADO");
		}
			else{
				System.out.print("EMPRÉSTIMO NEGADO");}
	}
}

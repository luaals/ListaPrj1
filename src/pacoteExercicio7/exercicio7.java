package pacoteExercicio7;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tv;
		 Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o total de vendas: "); 
		tv = entrada.nextInt();
		if (tv>=2000){
		System.out.println("Seu salário será R$" +(tv*0.1)+1200);}
		else{
			System.out.println("Seu sálario será de apenas R$1200");
		}
	}
}

		

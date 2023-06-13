package pacoteExercicio8;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double h;
		int s;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe sua altura: ");
		h = entrada.nextDouble();
		System.out.println("Escolha a opcao:");
		     System.out.println("1-feminino");
		     System.out.println("2-masculino");
		     s = entrada.nextInt();
		     switch(s){
		     case 1:
		System.out.println("\n Seu peso ideal é de " +(62.1*h-44.7)); 
		break;
		default:
		     case 2:
		    	System.out.print("\n Seu peso ideal é de " +(72.7*h-58)); 
	}
	}
}

package pacoteExercicio3;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N1;
		int N2;
		int N3;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Primeiro valor: ");
		N1 = entrada.nextInt();
		System.out.println("Segundo Valor: ");
		 N2 = entrada.nextInt();
		System.out.println("Terceiro valor: ");
		 N3 = entrada.nextInt();
		if(N1>N2 & N1>N3)
		{
			System.out.println("O maior valor é "+N1);
		}
		else if((N2>N1) & (N2>N3))
		{
			System.out.println("O maior valor é "+N2);
		}else		{
			System.out.println("O maior valor é "+N3);
}

	}

}

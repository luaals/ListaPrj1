package pacoteExercicio10;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tc;
		double vg, ct;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o tipo de carro: \n");
		System.out.println("1) G \n");
		System.out.println("2) A \n");
		tc = entrada.nextInt();
		System.out.println("Informe a capacidade do tanque: ");
		ct = entrada.nextInt();
		switch (tc)
		{
		case 1:
			System.out.println("Você gastará R$" +(vg=1.80*ct));
			break;
			default:
		case 2:
				System.out.println("Você gastará R$" +(vg=1.00*ct));
			break;
	}
	}
}

package pacoteExercicio9;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double he, me, hs, ms, pag, tempo;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a hora de entrada: ");
		he = entrada.nextInt();
		System.out.println("Informe o minuto de entrada: ");
		me = entrada.nextInt();
		System.out.println("Informe o horário de saída: ");
		hs = entrada.nextInt();
		System.out.println("Informe o minuto de saída: ");
		ms = entrada.nextInt();
		tempo = (hs+ms)-(he+me);
		if (tempo <= 1) {
			System.out.println("Você pagará R$4.00");
		}else if(tempo <= 2){
			System.out.println("Você pagará R$6.00");
		}else if(tempo>2) {
			System.out.println("Você pagará R$" +((tempo - 2)*1)+6);
		}
	
}
}


package pacoteExercicio4;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tt;
		int sal;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Tempo de trabalho: ");
	    tt = entrada.nextInt();
	    System.out.println("Sálario: ");
	    sal = entrada.nextInt();

		if (tt>=5){
			   System.out.println("Você receberá um aumento. O valor é: "+ ((sal*20)/100) +" reais");
			   }
		else{
			System.out.print("Voce receberá um aumento menor. O valor é de: "+ ((sal*10)/100) +" reais");
		}
	}

}

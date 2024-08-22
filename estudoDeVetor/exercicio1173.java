import java.util.Scanner;

public class exercicio1173{
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n[] = new int[10];
		//define o tamanho do vetor
	
		n[0]= s. nextInt();
		// indica entrada manual do valor dentro do vetor 

		for(int i = 1; i < n.length; i++){
			// define a forma como o valor vai comportar dentro do vetor
			n[i] = n[i-1]*2;
			//indica o calculo feito com o valor imputado, l
			// lembrete para claudio, se o valor vai receber algum calculo I-1 mais o operador.
			}
		
			for (int j = 0; j < n.length ; j++){
				// indica como será a apresentação do vetor

			System.out.println("N[" + j + "] = " + n[j]);
	}
	
		}

}
	
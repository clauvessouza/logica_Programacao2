import java.util.Scanner;

public class exe1080{
	//teste commit
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = 0 ; //recebe valores a serem analisados;
		int maior = 0; // armazena qual o maior valor;
		int posicao = 0; // armazena qual a posição o valor esta localizado;
		
		for (int i = 0; i <100; i++) {
			n = s.nextInt();
			if(n>maior){
			 maior = n;
			 posicao = i+1;
			}
			
		}
		
		System.out.println(maior);
		System.out.println(posicao);
	}
}

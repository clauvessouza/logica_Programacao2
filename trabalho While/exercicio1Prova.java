import java.util.Scanner;

public class exercicio1Prova{
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); 
		int maior=Integer.MIN_VALUE; 
		int x=0;	
		for (int i = 0; i < n; i++) {
			x = s.nextInt();
			if(x>maior){
			  maior = x;
			
			}
			
		}
		
		System.out.println("Maior =" + maior);
		
	}
}

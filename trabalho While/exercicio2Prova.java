import java.util.Scanner;

public class exercicio2Prova{
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); 
		int negativo = 0; 
		int x = 0;	
		for (int i = 0; i < n; i++) {
			x = s.nextInt();
			if(x<0){
			  negativo ++;
			
			}
			
		}
		
		System.out.println(negativo);
		
	}
}
